package com.shadab.heathcare.hospital.domain.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DoctorDto {
	
	@NotNull
	private long id;
	
	@NotNull
	@Size(min = 3, message ="name must be minimum 3 characters")
	private String name;
	
	@NotNull
	private String qualification;
	
	@NotNull
	private double experience ;
	
	@NotNull
	@Size(min = 2, message = "specialization must be minimum 2 characters")
	private String specialization;
	
	@NotNull
	private double consultingFees;

	public DoctorDto() {
	}
	
	public DoctorDto(int id, String name, String qualification, double experience, String specialization,
			double consultingFees) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.specialization = specialization;
		this.consultingFees = consultingFees;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public double getConsultingFees() {
		return consultingFees;
	}

	public void setConsultingFees(double consultingFees) {
		this.consultingFees = consultingFees;
	}
	
	
}
