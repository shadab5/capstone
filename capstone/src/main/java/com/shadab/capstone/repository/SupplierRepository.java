package com.shadab.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shadab.capstone.entity.SupplierDtls;

public interface SupplierRepository extends JpaRepository<SupplierDtls, Integer>{

	public boolean existsByEmail(String email);

	public SupplierDtls findByEmail(String email);
}
