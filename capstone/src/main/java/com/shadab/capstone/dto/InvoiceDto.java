package com.shadab.capstone.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(
        value = {"id", "created_at"},
        allowGetters = true
)
public class InvoiceDto {
	
	@JsonProperty("id")
	@JsonIgnore
	private Long id;
	
	@JsonProperty("supplier_code")
	@NotNull
	private String supplierCode;
	
	@JsonProperty("invoice_number")
	@NotNull
	private String invoiceNumber;
	
	@JsonProperty("invoice_date")
	@NotNull
	private LocalDate invoiceDate;
	
	@JsonProperty("invoice_amount")
	@NotNull
	private Long invoiceAmount;
	
	@JsonProperty("currency")
	@NotNull
	private String currency;
	
	@JsonProperty("invoice_status")
	@NotNull
	private String invoiceStatus;
	
	@JsonProperty("invoice_file")
	@NotNull
	private String invoiceFile;
	
	@JsonProperty("created_at")
	@JsonIgnore
	private LocalDateTime createdAt = LocalDateTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Long getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(Long invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getInvoiceFile() {
		return invoiceFile;
	}

	public void setInvoiceFile(String invoiceFile) {
		this.invoiceFile = invoiceFile;
	}

	
}
