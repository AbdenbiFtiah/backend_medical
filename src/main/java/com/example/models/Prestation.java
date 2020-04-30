package com.example.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 @Entity
public class Prestation implements Serializable {
	 @Id @GeneratedValue
	private Long id;
	private String nom_etablissement;
	private String nom_medecin;
	private String intervention;
	 @Temporal(TemporalType.DATE)
	private Date date_intervention;
	private String reference;
	private int montant;
	
	public Prestation() {
		
	}
	
	public Prestation(String nom_etablissement, String nom_medecin, String intervention, Date date_intervention,
			String reference, int montant) {
		super();
		this.nom_etablissement = nom_etablissement;
		this.nom_medecin = nom_medecin;
		this.intervention = intervention;
		this.date_intervention = date_intervention;
		this.reference = reference;
		this.montant = montant;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom_etablissement() {
		return nom_etablissement;
	}
	public void setNom_etablissement(String nom_etablissement) {
		this.nom_etablissement = nom_etablissement;
	}
	public String getNom_medecin() {
		return nom_medecin;
	}
	public void setNom_medecin(String nom_medecin) {
		this.nom_medecin = nom_medecin;
	}
	public String getIntervention() {
		return intervention;
	}
	public void setIntervention(String intervention) {
		this.intervention = intervention;
	}
	public Date getDate_intervention() {
		return date_intervention;
	}
	public void setDate_intervention(Date date_intervention) {
		this.date_intervention = date_intervention;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	
	

}
