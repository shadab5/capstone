package com.shadab.capstone.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shadab.capstone.entity.SupplierDtls;
import com.shadab.capstone.repository.SupplierRepository;

@Controller
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	private SupplierRepository supplierRepo;

	@ModelAttribute
	private void supplierDetails(Model m, Principal p) {
		String email = p.getName();
		SupplierDtls user = supplierRepo.findByEmail(email);

		m.addAttribute("user", user);

	}

	@GetMapping("/")
	public String home() {
		return "user/home";
	}
}
