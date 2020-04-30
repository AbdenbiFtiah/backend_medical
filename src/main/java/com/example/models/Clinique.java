package com.example.models;

import javax.persistence.Entity;

@Entity
public class Clinique extends Site	{

	public Clinique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clinique(String adresse, String nom, String description, String email, int tel) {
		super(adresse, nom, description, email, tel);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
