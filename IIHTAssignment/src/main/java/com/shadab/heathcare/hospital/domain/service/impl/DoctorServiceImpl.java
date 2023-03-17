package com.shadab.heathcare.hospital.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.shadab.heathcare.hospital.domain.Exception.ResourceNotFoundException;
import com.shadab.heathcare.hospital.domain.entity.Doctor;
import com.shadab.heathcare.hospital.domain.repository.DoctorRepository;
import com.shadab.heathcare.hospital.domain.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository<?> doctorRepository;

	@Override
	public Doctor createDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getListOfDoctor() {
		return doctorRepository.list();
	}

}
