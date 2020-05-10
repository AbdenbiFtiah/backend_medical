package com.example.models;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Patient extends Utilisateur{
	
	
	private LocalDate date_naissance;
	
	@ManyToOne
	private Mutuel mutuel;
	
	@OneToMany(mappedBy="patient")
	private Collection<RendezVous> rendezVous;
	

	public LocalDate getDate_naissance() {
		return date_naissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
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
			String sexe, String email, int tel, String login, String password, LocalDate datenaissance) {			
		super(nom, prenom, adresse, identification, typeId, pays, sexe, email, tel, login, password);
		this.date_naissance=datenaissance;
	}
	

	
	
	
	
	
	
	

}
