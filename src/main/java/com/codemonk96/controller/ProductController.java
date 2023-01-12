package com.codemonk96.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemonk96.model.SmartPhone;
import com.codemonk96.service.*;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ProductController {
	
	@Autowired 
	private ProductService service;
	
	
	
	@PostMapping ("/smartphones/add")
	public ResponseEntity<?> addSmartPhone(@RequestBody SmartPhone newSmartPhone){
		
		return new ResponseEntity<>(service.saveProduct(newSmartPhone), HttpStatus.CREATED);
	}
	
	@GetMapping ("/smartphones")
	public ResponseEntity<?> getAllSmartPhones(){
		
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping ("/smartphones/{id}")
	public ResponseEntity<?> getSmartPhoneById(@PathVariable Integer id){
		
		return new ResponseEntity<>(service.getProductById(id), HttpStatus.OK);
	}
	
	@DeleteMapping ("/smartphones/delete/{id}")
	public ResponseEntity<?> deleteSmartPhone(@PathVariable Integer id){
		System.out.println("in delete product "+ id);
		
		return	new ResponseEntity<>(service.deleteProduct(id), HttpStatus.OK);
		
	}
	
	@PutMapping ("/smartphones/update/{id}")
	public ResponseEntity<?> updateSmartPhone(@RequestBody SmartPhone smartPhone, @PathVariable Integer id){
		
		return new ResponseEntity<>(service.editProduct(smartPhone, id), HttpStatus.CREATED);
	}

}
