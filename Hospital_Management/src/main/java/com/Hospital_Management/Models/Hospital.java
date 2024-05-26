package com.Hospital_Management.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String address;
    @OneToMany(mappedBy = "patient")
    List<Patient> patientList;

    @OneToMany(mappedBy = "doctor")
    List<Doctor>doctorList;

    public Hospital() {
    }

    public Hospital(int id, String name, String address, List<Patient> patientList, List<Doctor> doctorList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.patientList = patientList;
        this.doctorList = doctorList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
}
