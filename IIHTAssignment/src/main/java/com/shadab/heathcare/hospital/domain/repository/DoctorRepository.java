package com.shadab.heathcare.hospital.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.shadab.heathcare.hospital.domain.entity.Doctor;

@Repository
@EnableJpaRepositories
public interface DoctorRepository<T> extends JpaRepository<Doctor, Integer>{
	
	@Query(value = "SELECT * FROM DOCTOR ", nativeQuery = true)
	public List<Doctor> list();
	
	public Doctor save(Doctor doctor);
	
}
