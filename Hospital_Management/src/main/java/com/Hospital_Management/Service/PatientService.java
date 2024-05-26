package com.Hospital_Management.Service;

import com.Hospital_Management.Models.Patient;
import com.Hospital_Management.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    PatientRepo patientRepo;

    public void addPatient(Patient patient){
        patientRepo.save(patient);


    }
}
