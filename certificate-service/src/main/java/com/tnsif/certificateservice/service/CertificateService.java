package com.tnsif.certificateservice.service;

import com.tnsif.certificateservice.entity.Certificate;

public interface CertificateService {

    Certificate addCertificate(Certificate certificate);

    Certificate updateCertificate(Certificate certificate);

    Certificate searchCertificate(Long id);

    Boolean deleteCertificate(Long id);
}