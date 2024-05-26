package com.Hospital_Management.Repository;

import com.Hospital_Management.Models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital,Integer> {
    @Query(value = "Select * from Hospital where hospital_Id =:hospitalId")
    public Hospital getBYId(String hospitalId);
}

