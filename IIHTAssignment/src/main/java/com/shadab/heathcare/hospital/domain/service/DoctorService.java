package com.shadab.heathcare.hospital.domain.service;

import java.util.List;

import com.shadab.heathcare.hospital.domain.entity.Doctor;

public interface DoctorService {
	
	Doctor createDoctor(Doctor doctor);
	
	List<Doctor> getListOfDoctor();
	
}
