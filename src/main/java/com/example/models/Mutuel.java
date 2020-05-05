package com.example.models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Mutuel implements Serializable{
	@Id
	@Column(unique=true,columnDefinition="VARCHAR(64)")
	private String id;
	private String nom;
	
	@OneToMany(mappedBy="mutuel")
	private Collection<Patient> patients;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Mutuel(String id, String nom) {
		super();
		this.id=id;
		this.nom = nom;
	}

	public Mutuel() {
		super();
	}
	
	

}
