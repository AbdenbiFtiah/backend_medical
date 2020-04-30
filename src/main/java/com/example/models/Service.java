package com.example.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Service {

	@Id @GeneratedValue
	private int id;
	private String reference;
	private Date dateService;
	private int montant;
	
	@ManyToOne
	private MethodePayement methodePayement;
	
	@ManyToOne
	private Medecin medecin;
	
	@ManyToOne
	private Site site;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDateService() {
		return dateService;
	}

	public void setDateService(Date dateService) {
		this.dateService = dateService;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public MethodePayement getMethodePayement() {
		return methodePayement;
	}

	public void setMethodePayement(MethodePayement methodePayement) {
		this.methodePayement = methodePayement;
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

	public Service(String reference, Date dateService, int montant, MethodePayement methodePayement, Medecin medecin,
			Site site) {
		super();
		this.reference = reference;
		this.dateService = dateService;
		this.montant = montant;
		this.methodePayement = methodePayement;
		this.medecin = medecin;
		this.site = site;
	}

	public Service() {
		super();
	}
	
	
	
}
