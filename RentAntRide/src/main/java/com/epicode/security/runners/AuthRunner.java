package com.epicode.security.runners;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.epicode.security.enumerations.UserRole;
import com.epicode.security.models.Role;
import com.epicode.security.models.User;
import com.epicode.security.repositories.RoleRepository;
import com.epicode.security.repositories.UserRepository;
import com.epicode.security.services.AuthService;
import com.github.javafaker.Faker;

@Component
@Order(1)
public class AuthRunner implements ApplicationRunner {

	@Autowired
	RoleRepository roleRepository;
	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	AuthService authService;

	private Set<Role> adminRole;
	private Set<Role> userRole;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		setRoleDefault();
		saveUserDefault();
	}

	private void setRoleDefault() {
		System.out.println("Populate roles table");
		
		Role admin = new Role();
		admin.setRole(UserRole.ROLE_ADMIN);

		Role user = new Role();
		user.setRole(UserRole.ROLE_USER);

		if (!roleRepository.existsByRole(UserRole.ROLE_ADMIN)) {
			roleRepository.save(admin);
		}

		if (!roleRepository.existsByRole(UserRole.ROLE_USER)) {
			roleRepository.save(user);
		}

		adminRole = new HashSet<Role>();
		adminRole.add(admin);
		adminRole.add(user);

		userRole = new HashSet<Role>();
		userRole.add(user);
	}

	public void saveUserDefault() {
		
		System.out.println("Populate users table");
		
		if (userRepository.findByEmail("emanuele.syrbe@epicode.com").isEmpty()) {
			User admin = new User();
			admin.setUsername("manu.lele");
			admin.setEmail("emanuele.syrbe@epicode.com");
			admin.setPassword(passwordEncoder.encode("qwerty"));
			admin.setFirstname("Emanuele");
			admin.setLastname("Syrbe");
			admin.setRoles(adminRole);
			userRepository.save(admin);
		}
		
		if (userRepository.findAll().size() < 2) {
			
			Faker faker = new Faker(new Locale("it", "IT"));
			for(int i=0; i<9; i++) {
				
				User user = new User();
				user.setFirstname(faker.name().firstName());
				user.setLastname(faker.name().lastName());
				user.setUsername(user.getFirstname().toLowerCase() + "." + user.getLastname().toLowerCase());
				user.setEmail(user.getFirstname().toLowerCase() + "." + user.getLastname().toLowerCase() + "@example.com");
				user.setPassword(passwordEncoder.encode("user"));
				user.setRoles(userRole);
				userRepository.save(user);
			}
		}

	}

}
