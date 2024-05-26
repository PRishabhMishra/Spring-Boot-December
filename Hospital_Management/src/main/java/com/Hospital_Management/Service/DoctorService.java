package com.Hospital_Management.Service;

import com.Hospital_Management.Models.Doctor;
import com.Hospital_Management.Models.Hospital;
import com.Hospital_Management.Repository.DoctorRepo;
import com.Hospital_Management.Repository.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepo doctorRepo;
    @Autowired
    HospitalRepo hospitalRepo;

    public void addDoctor(Doctor doctor,String hospitalId){
        Hospital hospital = hospitalRepo.getBYId(hospitalId);
        List<Doctor>doctorList = hospital.getDoctorList();
        doctorList.add(doctor);
        doctorRepo.save(doctor);

    }
}
