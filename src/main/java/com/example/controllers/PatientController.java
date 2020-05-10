package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Patient;
import com.example.service.PatientService;

@RestController
@RequestMapping("patients")
	@CrossOrigin("*")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@GetMapping
	public ResponseEntity<List<Patient>> patients(){
		return ResponseEntity.ok(patientService.getPatients());	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Patient> patient(@PathVariable int id){
		return ResponseEntity.ok(patientService.getPatient(id));	
	}
	
	@PostMapping
	public ResponseEntity<Patient> addPatient(@RequestBody Patient p){
		return ResponseEntity.ok().body(patientService.addPatient(p));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Patient> updatePatient(@PathVariable int id,@RequestBody Patient p){
		return ResponseEntity.ok(patientService.updatePatient(id, p));
	}
	
	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable int id){
		patientService.deletePatient(id);
	}
}
