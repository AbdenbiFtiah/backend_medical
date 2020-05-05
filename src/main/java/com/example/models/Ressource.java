package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ressource {

	@Id @GeneratedValue
	private int id;
	private String nom,description;
	
	@OneToOne(mappedBy="ressource")
	private Role role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Ressource(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}
	public Ressource() {
		super();
	}
	
	
}
