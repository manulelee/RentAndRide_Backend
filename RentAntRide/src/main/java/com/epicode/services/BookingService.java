package com.epicode.services;

import java.util.List;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.models.Booking;
import com.epicode.repository.BookingRepository;
import com.epicode.security.models.User;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class BookingService {
	
	@Autowired private BookingRepository repository;
	
	public List<Booking> getAllBooking() {
		return repository.findAll();
	}

	public Booking getBookingByID(Long id) {
		if(!repository.existsById(id)) {
			throw new EntityExistsException("Booking ID " + id + " does not exist...");
		}
		return repository.findById(id).get();
	}
	
	public List<Booking> getUserBooking(User user){
		return repository.findByUser(user);
	}

	public Booking createBooking(Booking booking) {
		if(repository.findByEquipmentAndDay(booking.getEquipment(), booking.getDay()) != null) {
			throw new NotImplementedException("This equipment is not aviable on " + booking.getDay());
		}
		return repository.save(booking);
	}

	public Booking updateBooking(Long id, Booking booking) {
		if(!repository.existsById(id)) {
			throw new EntityExistsException("Booking ID " + id + " does not exist...");
		}
		return repository.save(booking);
	}

	public String removeBooking(Long id) {
		if(!repository.existsById(id)) {
			throw new EntityExistsException("Booking ID " + id + " does not exist...");
		}
		repository.deleteById(id);
		return "Booking removed succesfully!";
	}

}
