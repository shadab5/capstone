package com.shadab.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shadab.capstone.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice,Long>{

}
