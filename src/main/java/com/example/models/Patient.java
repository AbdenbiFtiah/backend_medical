package com.example.models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Patient extends User{
	
	
	private Date date_naissance;
	
	@ManyToOne
	private Mutuel mutuel;
	
	@OneToMany(mappedBy="patient")
	private Collection<RendezVous> rendezVous;
	

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.date_naissance = dateNaissance;
	}

	

	public Mutuel getMutuel() {
		return mutuel;
	}

	public void setMutuel(Mutuel mutuel) {
		this.mutuel = mutuel;
	}

	public Patient() {
		super();
	}

	public Patient(String nom, String prenom, String adresse, String identification, String typeId, String pays,
			String sexe, String email, int tel, String login, String password, Date datenaissance) {
			//Mutuel mutuel
			
		super(nom, prenom, adresse, identification, typeId, pays, sexe, email, tel, login, password);
		// TODO Auto-generated constructor stub
		this.date_naissance=datenaissance;
		//this.mutuel=mutuel;
	}
	

	
	
	
	
	
	
	

}
