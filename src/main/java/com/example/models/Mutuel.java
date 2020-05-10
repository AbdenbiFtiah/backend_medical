package com.example.models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Mutuel implements Serializable{
	@Id 
	private int id;
	private String nom;
	
	@OneToMany(mappedBy="mutuel")
	@JsonIgnore
	private Collection<Patient> patients;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Collection<Patient> patients) {
		this.patients = patients;
	}

	public Mutuel(int id, String nom) {
		super();
		this.id=id;
		this.nom = nom;
	}

	public Mutuel() {
		super();
	}
	
	

}
