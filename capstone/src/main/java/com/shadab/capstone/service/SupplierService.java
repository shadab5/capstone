package com.shadab.capstone.service;

import com.shadab.capstone.entity.SupplierDtls;

public interface SupplierService {

	public SupplierDtls createUser(SupplierDtls user);

	public boolean checkEmail(String email);
}
