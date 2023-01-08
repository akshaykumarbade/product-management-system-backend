package com.codemonk96.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemonk96.model.SmartPhone;

public interface ProductRepository extends JpaRepository<SmartPhone, Integer> {

}
