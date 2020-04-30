package com.example.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Medecin extends User {
	
	@ManyToOne
	private Specialite specialite;
	
	@OneToOne(mappedBy="medecin")
	private Cabinet cabinet;
	
	@OneToMany(mappedBy="medecin")
	private Collection<RendezVous> rendezVous;
	@OneToMany(mappedBy="medecin")
	private Collection<Service> services;
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	public Cabinet getCabinet() {
		return cabinet;
	}
	public void setCabinet(Cabinet cabinet) {
		this.cabinet = cabinet;
	}
	
	
	public Medecin(String nom, String prenom, String adresse, String identification, String typeId, String pays,
			String sexe, String email, int tel, String login, String password) {
		super(nom, prenom, adresse, identification, typeId, pays, sexe, email, tel, login, password);
		// TODO Auto-generated constructor stub
	}
	
	public Medecin() {
		super();
	}
	
	
	
	
	
	
	


	
	
	
	
	

}
