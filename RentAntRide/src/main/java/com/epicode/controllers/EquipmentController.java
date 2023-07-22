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

import com.epicode.enumerations.CategoryType;
import com.epicode.models.Equipment;
import com.epicode.services.EquipmentService;

@RestController
@RequestMapping("/api/equipment")
@CrossOrigin(origins = "*", maxAge = 3600)
public class EquipmentController {
	
	@Autowired private EquipmentService equipmentService;
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(equipmentService.getAllEquiment());
	}
	
	@GetMapping("/category/{category}")
	public ResponseEntity<?> getByCategory(@PathVariable CategoryType category) {
		return ResponseEntity.ok(equipmentService.getByCategory(category));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		return ResponseEntity.ok(equipmentService.getEquipmentByID(id));
	}
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> save(@RequestBody Equipment equipment) {
		return ResponseEntity.ok(equipmentService.createEquipment(equipment));
	}
	
	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Equipment equipment) {
		return ResponseEntity.ok(equipmentService.updateEquipment(id, equipment));
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> remove(@PathVariable Long id) {
		return ResponseEntity.ok(equipmentService.removeEquipment(id));
	}


}
