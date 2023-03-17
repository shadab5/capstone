package com.shadab.capstone.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.shadab.capstone.entity.SupplierDtls;
import com.shadab.capstone.repository.SupplierRepository;
import com.shadab.capstone.service.SupplierService;

@Service
public class SupplierServiceImp implements SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncode;

	@Override
	public SupplierDtls createUser(SupplierDtls user) {

		user.setPassword(passwordEncode.encode(user.getPassword()));
		user.setRole("ROLE_USER");

		return supplierRepo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {

		return supplierRepo.existsByEmail(email);
	}

}
