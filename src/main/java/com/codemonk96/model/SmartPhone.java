package com.codemonk96.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
//@Table (name="smartphones", uniqueConstraints = @UniqueConstraint(columnNames= {}))
public class SmartPhone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String name;
	
	
	private String ram_GB;
	
	
	private String storage_GB;
	
	
	private String camera_Pixel;
	
	
	private Double price_$dollars;
	
	
	private String brand;
	
	
	private String status;

}
