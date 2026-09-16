package com.tnsif.certificateservice.service;

import org.springframework.stereotype.Service;

import com.tnsif.certificateservice.entity.Certificate;
import com.tnsif.certificateservice.repository.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService {

    private final CertificateRepository repository;

    public CertificateServiceImpl(CertificateRepository repository) {
        this.repository = repository;
    }

    @Override
    public Certificate addCertificate(Certificate certificate) {
        return repository.save(certificate);
    }

    @Override
    public Certificate updateCertificate(Certificate certificate) {
        return repository.save(certificate);
    }

    @Override
    public Certificate searchCertificate(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Boolean deleteCertificate(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}