package com.codemonk96.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codemonk96.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query
	User findByUsernameAndPassword(String username, String password);
}
