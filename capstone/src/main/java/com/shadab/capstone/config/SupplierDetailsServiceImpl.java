package com.shadab.capstone.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.shadab.capstone.entity.SupplierDtls;
import com.shadab.capstone.repository.SupplierRepository;

public class SupplierDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private SupplierRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		SupplierDtls user = userRepo.findByEmail(email);

		if (user != null) {
			return new CustomUserDetails(user);
		}

		throw new UsernameNotFoundException("Supplier not available");
	}
}
