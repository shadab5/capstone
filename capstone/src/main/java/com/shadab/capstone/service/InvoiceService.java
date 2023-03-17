package com.shadab.capstone.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.shadab.capstone.entity.Invoice;
import com.shadab.capstone.repository.InvoiceRepository;

import lombok.RequiredArgsConstructor;

@Service
@Validated
@RequiredArgsConstructor
public class InvoiceService {
		
    private InvoiceRepository invoiceRepository;
    
    public void saveAll(@Valid List<Invoice> invoice) {
    	invoiceRepository.saveAll(invoice);
    }
}
