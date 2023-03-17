package com.shadab.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shadab.capstone.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{

	public boolean existsByEmail(String email);

	public UserDtls findByEmail(String email);
	
}
