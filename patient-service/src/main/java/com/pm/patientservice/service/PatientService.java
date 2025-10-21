package com.pm.patientservice.service;

import com.pm.patientservice.dto.PatientResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    List<PatientResponseDTO> getPatients();
}
