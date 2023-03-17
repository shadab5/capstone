package com.shadab.capstone.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.shadab.capstone.entity.Invoice;
import com.shadab.capstone.service.InvoiceService;
import com.shadab.capstone.util.CsvUtils;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class InvoiceController {

    private InvoiceService invoiceService;

    @PostMapping(value = "/upload", consumes = "text/csv")
    public void uploadSimple(@RequestBody InputStream body) throws IOException {
    	invoiceService.saveAll(CsvUtils.read(Invoice.class, body));
    }

    @PostMapping(value = "/upload", consumes = "multipart/form-data")
    public void uploadMultipart(@RequestParam("file") MultipartFile file) throws IOException {
    	invoiceService.saveAll(CsvUtils.read(Invoice.class, file.getInputStream()));
    }
}
