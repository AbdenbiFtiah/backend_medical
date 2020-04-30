package com.example.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Specialite {
	
	@Id @GeneratedValue
	private int id;
	private String nomSpecialite;
	
	@OneToMany(mappedBy="specialite")
	private Collection<Medecin> medecins;

	public Specialite(String nomSpecialite) {
		super();
		this.nomSpecialite = nomSpecialite;
	}

	public Specialite() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomSpecialite() {
		return nomSpecialite;
	}

	public void setNomSpecialite(String nomSpecialite) {
		this.nomSpecialite = nomSpecialite;
	}
	
	

}
