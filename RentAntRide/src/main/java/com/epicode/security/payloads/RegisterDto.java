package com.epicode.security.payloads;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    private String username;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    // Passagio di ruoli dal client (Facoltativo)
    private Set<String> roles;
}

// Formato dati JSON registrazione

/*{
    "firstname": "FirstName",
    "lastname": "LastName",
    "username": "Username",
    "email": "first.last@admin.com",
    "password": "test",
    "roles": ["MODERATOR", "USER"]
}*/
