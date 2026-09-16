package com.tnsif.certificateservice.controller;

import org.springframework.web.bind.annotation.*;

import com.tnsif.certificateservice.entity.Certificate;
import com.tnsif.certificateservice.service.CertificateService;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    private final CertificateService service;

    public CertificateController(CertificateService service) {
        this.service = service;
    }

    @PostMapping
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return service.addCertificate(certificate);
    }

    @PutMapping
    public Certificate updateCertificate(@RequestBody Certificate certificate) {
        return service.updateCertificate(certificate);
    }

    @GetMapping("/{id}")
    public Certificate searchCertificate(@PathVariable Long id) {
        return service.searchCertificate(id);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteCertificate(@PathVariable Long id) {
        return service.deleteCertificate(id);
    }
}