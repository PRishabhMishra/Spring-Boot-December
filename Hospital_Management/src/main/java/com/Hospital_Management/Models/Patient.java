package com.Hospital_Management.Models;

import jakarta.persistence.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String patientName;
    int age;
    String address;
    String illness;
    @ManyToOne
    Doctor doctor;
    @ManyToOne
    Hospital hospital;

    public Patient() {
    }

    public Patient(int id, String patientName, int age, String address, String illness, Doctor doctor, Hospital hospital) {
        this.id = id;
        this.patientName = patientName;
        this.age = age;
        this.address = address;
        this.illness = illness;
        this.doctor = doctor;
        this.hospital = hospital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
