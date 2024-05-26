package com.Hospital_Management.Service;

import com.Hospital_Management.Models.Hospital;
import com.Hospital_Management.Repository.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {

    @Autowired
    HospitalRepo hospitalRepo;

    public String addHospital(Hospital hospital){
        hospitalRepo.save(hospital);
        return "Hospital added Successfully";
    }
}
