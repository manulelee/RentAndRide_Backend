package com.epicode.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.enumerations.CategoryType;
import com.epicode.models.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long>{
	
	public Equipment findByBrandAndModelAndSizeAndDescription(String brand, String model, String size, String description);
	
	public List<Equipment> findByCategory(CategoryType category);
}
