package com.codemonk96.service;

import java.util.List;

import com.codemonk96.model.SmartPhone;

public interface ProductService {
	
	public SmartPhone saveProduct(SmartPhone smartPhone);
	
	public List<SmartPhone> getAll();
	
	public SmartPhone getProductById(Integer id);
	
	public String deleteProduct(Integer Id);
	
	public SmartPhone editProduct(SmartPhone smartPhone, Integer id);

}
