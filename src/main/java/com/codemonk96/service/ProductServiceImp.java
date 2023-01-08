package com.codemonk96.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemonk96.model.SmartPhone;
import com.codemonk96.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {
	
	@Autowired ProductRepository productRepo;

	@Override
	public SmartPhone saveProduct(SmartPhone smartPhone) {
		
		System.out.println("in saveProduct method...");
		
		return productRepo.save(smartPhone);
	}

	@Override
	public List<SmartPhone> getAll() {
		
		System.out.println("in getAll method...");
		
		return productRepo.findAll();
	}

	@Override
	public SmartPhone getProductById(Integer id) {
		
		System.out.println("in getProductById method...");
		
		return productRepo.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		
		SmartPhone smartphone = productRepo.findById(id).get();
		
		System.out.println("in deleteProduct method...");
		
		if(smartphone != null) {
			productRepo.deleteById(id);
			return "Product details deleted with Id ";
		}
		else {
			return "Product not found ...";
		}
	}

	@Override
	public SmartPhone editProduct(SmartPhone smartPhone, Integer id) {
		
		System.out.println("in editProduct method");
		
		SmartPhone old = productRepo.findById(id).get();
		
		old.setName(smartPhone.getName());
		old.setRam_GB(smartPhone.getRam_GB());
		old.setStorage_GB(smartPhone.getStorage_GB());
		old.setCamera_Pixel(smartPhone.getCamera_Pixel());
		old.setPrice_$dollars(smartPhone.getPrice_$dollars());
		old.setBrand(smartPhone.getBrand());
		
		return productRepo.save(old);
	}

}
