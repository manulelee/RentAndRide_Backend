package com.epicode.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.models.Booking;
import com.epicode.security.models.User;
import com.epicode.security.repositories.UserRepository;
import com.epicode.services.BookingService;


@RestController
@RequestMapping("/api/booking")
@CrossOrigin(origins = "*", maxAge = 3600)
public class BookingController {

	@Autowired private BookingService bookingService;
	 @Autowired private UserRepository userRepository;
	
	@GetMapping("/all")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(bookingService.getAllBooking());
	}
	
	@GetMapping("/user/{username}")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> getByUser(@PathVariable String username) {
		return ResponseEntity.ok(bookingService.getUserBooking(userRepository.findByUsername(username).get()));
	}
	
	
	@GetMapping("/{id}")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		return ResponseEntity.ok(bookingService.getBookingByID(id));
	}
	
	@PostMapping
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> save(@RequestBody Booking booking) {
		return ResponseEntity.ok(bookingService.createBooking(booking));
	}
	
	@PutMapping("/{id}")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Booking booking) {
		return ResponseEntity.ok(bookingService.updateBooking(id, booking));
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> remove(@PathVariable Long id) {
		return ResponseEntity.ok(bookingService.removeBooking(id));
	}

}
