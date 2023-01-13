package com.codemonk96.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemonk96.model.SmartPhone;

@Repository
public interface ProductRepository extends JpaRepository<SmartPhone, Integer> {

}
