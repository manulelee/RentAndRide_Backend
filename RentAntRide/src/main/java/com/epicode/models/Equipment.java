package com.epicode.models;

import com.epicode.enumerations.CategoryType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="equipment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Equipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String brand;
	
	@Column(nullable = false)
	private String model;
	
	@Column(nullable = false)
	private String size;
	
	private String description;
	
	@Column(nullable = false)
	private Double price;
	
	@Column(nullable = false)
	private String img;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private CategoryType category;
}
