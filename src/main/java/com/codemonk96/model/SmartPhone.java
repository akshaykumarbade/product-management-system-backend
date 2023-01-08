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
	
	//@Column (length = 40, name="name")
	private String name;
	
	//@Column (length = 30, name="ram")
	private String ram_GB;
	
	//@Column (length = 30, name="storage")
	private String storage_GB;
	
	//@Column (length=40, name="camera")
	private String camera_Pixel;
	
	//@Column (length = 40, name="price")
	private Double price_$dollars;
	
	//@Column (length = 30, name="brand")
	private String brand;
	
	//@Column (length = 30, name="brand")
	private String status;

}
