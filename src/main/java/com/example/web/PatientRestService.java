package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PatientRepository;
import com.example.models.Patient;

@RestController
public class PatientRestService {

	@Autowired
	PatientRepository patientRepository;
	
	 @RequestMapping(value="/addPatient", method=RequestMethod.POST)
	public Patient savePatient(@RequestBody Patient p){
		
		 return  patientRepository.save(p);
		
	}
	
}
