package com.example.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Site {

	@Id @GeneratedValue
	private int id;
	private String adresse;
	private String nom;
	private String description;
	private String email;
	private int tel;
	
	@OneToMany(mappedBy="site")
	private Collection<RendezVous> rendezVous;
	@OneToMany(mappedBy="site")
	private Collection<Service> services;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Site(String adresse, String nom, String description, String email, int tel) {
		super();
		this.adresse = adresse;
		this.nom = nom;
		this.description = description;
		this.email = email;
		this.tel = tel;
	}
	public Site() {
		super();
	}
	
	
}
