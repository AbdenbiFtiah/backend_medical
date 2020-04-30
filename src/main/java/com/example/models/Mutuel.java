package com.example.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Mutuel {
	@Id @GeneratedValue
	private int id;
	private String nom;
	
	@OneToMany(mappedBy="mutuel")
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

	public Mutuel(String nom, Collection<Patient> patients) {
		super();
		this.nom = nom;
		this.patients = patients;
	}

	public Mutuel() {
		super();
	}
	
	

}
