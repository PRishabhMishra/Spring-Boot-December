package com.Hospital_Management.Controller;

import com.Hospital_Management.Models.Patient;
import com.Hospital_Management.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    public String addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
        return "Patient added successfully";
    }
}
