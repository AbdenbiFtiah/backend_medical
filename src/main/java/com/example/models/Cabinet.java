package com.example.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Cabinet extends Site {

	@OneToOne
	private Medecin medecin;

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public Cabinet(String adresse, String nom, String description, String email, int tel) {
		super(adresse, nom, description, email, tel);
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
	
}
