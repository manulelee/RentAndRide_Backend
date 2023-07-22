package com.epicode.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.enumerations.CategoryType;
import com.epicode.models.Equipment;
import com.epicode.repository.EquipmentRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class EquipmentService {
	
	@Autowired private EquipmentRepository repository;
	
	public List<Equipment> getAllEquiment() {
		return repository.findAll();
	}
	
	public List<Equipment> getByCategory(CategoryType category) {
		return repository.findByCategory(category);
	}

	public Equipment getEquipmentByID(Long id) {
		if(!repository.existsById(id)) {
			throw new EntityExistsException("Equipment ID " + id + " does not exist...");
		}
		return repository.findById(id).get();
	}

	public Equipment createEquipment(Equipment equipment) {
		if(repository.findByBrandAndModelAndSizeAndDescription(equipment.getBrand(), equipment.getModel(), equipment.getSize(), equipment.getDescription()) != null) {
			throw new EntityExistsException("This equipment alredy exists!");
		}
		return repository.save(equipment);
	}

	public Equipment updateEquipment(Long id, Equipment equipment) {
		if(!repository.existsById(id)) {
			throw new EntityExistsException("Equipment ID " + id + " does not exist...");
		}
		return repository.save(equipment);
	}

	public String removeEquipment(Long id) {
		if(!repository.existsById(id)) {
			throw new EntityExistsException("Equipment ID " + id + " does not exist...");
		}
		repository.deleteById(id);
		return "Equipment ID " + id + " removed succesfully!";
	}


}
