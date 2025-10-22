package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestsDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patient.getId().toString());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setName(patient.getName());
        patientDTO.setAdress(patient.getAdress());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());


        return patientDTO;
    }

    public static Patient toModel(PatientRequestsDTO patientRequestsDTO) {
        Patient patient = new Patient();
        patient.setName(patientRequestsDTO.getName());
        patient.setAdress(patientRequestsDTO.getAdress());
        patient.setEmail(patientRequestsDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestsDTO.getDateOfBirth()));
        patient.setRegisterDate(LocalDate.parse(patientRequestsDTO.getRegistredDate()));
        return patient;
    }

}
