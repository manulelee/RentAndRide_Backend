package com.epicode.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.models.Booking;
import com.epicode.models.Equipment;
import com.epicode.security.models.User;

public interface BookingRepository extends JpaRepository<Booking, Long>{
	public Booking findByEquipmentAndDay(Equipment equipment, LocalDate day);
	
	public List<Booking> findByUser(User user);
}
