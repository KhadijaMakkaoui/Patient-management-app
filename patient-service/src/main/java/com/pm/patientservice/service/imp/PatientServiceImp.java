package com.pm.patientservice.service.imp;

import com.pm.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImp {
    private PatientRepository patientRepository;

    public PatientServiceImp(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
}
