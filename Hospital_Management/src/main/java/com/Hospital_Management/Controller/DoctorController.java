package com.Hospital_Management.Controller;

import com.Hospital_Management.Models.Doctor;
import com.Hospital_Management.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    public String addDoctor(@RequestBody Doctor doctor, @RequestParam String hospitalId){
        doctorService.addDoctor(doctor,hospitalId);
        return "Doctor added successfully";


    }
}
