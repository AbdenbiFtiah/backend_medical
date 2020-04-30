package com.example.models;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Intervention extends Service {

	public Intervention() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intervention(String reference, Date dateService, int montant, MethodePayement methodePayement,
			Medecin medecin, Site site) {
		super(reference, dateService, montant, methodePayement, medecin, site);
		// TODO Auto-generated constructor stub
	}

	
}
