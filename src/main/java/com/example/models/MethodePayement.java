package com.example.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MethodePayement {

	@Id @GeneratedValue
	private int id;
	private String nom;
	
	@OneToMany(mappedBy="methodePayement")
	private Collection<Service> services;
}
