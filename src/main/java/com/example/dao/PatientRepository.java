package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.models.Patient;

@RepositoryRestResource
@CrossOrigin("*")
public interface PatientRepository extends JpaRepository<Patient, Integer>{}
