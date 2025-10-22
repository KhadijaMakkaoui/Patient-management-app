package com.pm.patientservice.service;

import com.pm.patientservice.dto.PatientRequestsDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PatientService {
    List<PatientResponseDTO> getPatients();
    PatientResponseDTO createPatient(PatientRequestsDTO patientRequestsDTO);
}
