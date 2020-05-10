package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PatientRepository;
import com.example.models.Patient;



@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	
	public List<Patient> getPatients(){
		return patientRepository.findAll();
	}
	
	public Patient getPatient(int id){
		return patientRepository.findById(id).orElseThrow(()->new RuntimeException("Ce patient n'existe pas"));
	}
	
    @Transactional(rollbackOn = Throwable.class)
	public Patient addPatient(Patient p){
		return patientRepository.save(p);
	}
	
	
    @Transactional(rollbackOn = Throwable.class)
	public Patient updatePatient(int id, Patient p){
		if (!patientRepository.existsById(id)){
		throw new RuntimeException("Ce patient n'existe pas");
		}
		else{
			p.setId(id);
			return patientRepository.save(p);
		}
	}

	public void deletePatient(int id){
		patientRepository.deleteById(id);
	}
	 
	
}
