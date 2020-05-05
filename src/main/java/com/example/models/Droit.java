package com.example.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Droit {

	@Id @GeneratedValue
	private int id;
	private String nom,description;

	@OneToOne(mappedBy="droit")
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
	public Droit(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}
	public Droit() {
		super();
	}
	
	
	
}
