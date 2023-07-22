package com.epicode.runners;

import java.time.LocalDate;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.epicode.models.Booking;
import com.epicode.security.repositories.UserRepository;

import com.epicode.services.BookingService;
import com.epicode.services.EquipmentService;
import com.github.javafaker.Faker;

@Component
@Order(3)
public class BookingRunner implements ApplicationRunner{

	@Autowired BookingService bookingService;
	@Autowired EquipmentService equipmentService;
	@Autowired UserRepository userService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		if (bookingService.getAllBooking().isEmpty()) {
			
			System.out.println("Populate bookings table");
			
			int usersLength = userService.findAll().size();
			int equipmentLength = equipmentService.getAllEquiment().size();
			
			Faker faker = new Faker(new Locale("it", "IT"));
			for (int i=0; i< 15; i++) {
				Booking b = new Booking();
				b.setDay(LocalDate.now().plusDays(faker.number().numberBetween(3, 20)));
				b.setEquipment(equipmentService.getEquipmentByID((long) faker.number().numberBetween(1, equipmentLength)));
				b.setUser(userService.findById((long) faker.number().numberBetween(2, usersLength)).get());
				bookingService.createBooking(b);
				}	
		}
	}

}
