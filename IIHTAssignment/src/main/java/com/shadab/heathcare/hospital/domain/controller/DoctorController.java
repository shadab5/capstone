package com.shadab.heathcare.hospital.domain.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shadab.heathcare.hospital.domain.Exception.ResourceNotFoundException;
import com.shadab.heathcare.hospital.domain.entity.Doctor;
import com.shadab.heathcare.hospital.domain.repository.DoctorRepository;
import com.shadab.heathcare.hospital.domain.service.DoctorService;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/list")
	public List<Doctor> list(){
		return doctorService.getListOfDoctor();
	}
	
	@PostMapping("/create")
	private ResponseEntity<Doctor> create(@Valid @RequestBody Doctor doctor) {
		return new ResponseEntity<>(doctorService.createDoctor(doctor), HttpStatus.CREATED);
	}	

}
