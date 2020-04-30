package com.example.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RendezVous {

	@Id @GeneratedValue
	private int id;
	private Date dateRendezVous;
	private String description;
	
	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Medecin medecin;
	@ManyToOne
	private Site site;
	
	public Date getDateRendezVous() {
		return dateRendezVous;
	}
	public void setDateRendezVous(Date dateRendezVous) {
		this.dateRendezVous = dateRendezVous;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public RendezVous(Date dateRendezVous, String description, Patient patient, Medecin medecin, Site site) {
		super();
		this.dateRendezVous = dateRendezVous;
		this.description = description;
		this.patient = patient;
		this.medecin = medecin;
		this.site = site;
	}
	public RendezVous() {
		super();
	}
	
	
}
