package com.example.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Role {

	@Id @GeneratedValue
	private int id;
	private String name;
	private String description;
	
	@ManyToMany(mappedBy="roles")
	private Collection<Utilisateur> utilisateurs;
	
	@OneToOne
	private Droit droit;
	@OneToOne
	private Ressource ressource;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public Role() {
		super();
	}
	
	
}
