package com.example.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Utilisateur {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String identification;
	private String typeId;
	private String pays;
	private String sexe;
	private String email;
	private int tel;
	private String login;
	private String password;
	
	@ManyToMany()
	@JoinTable( name = "Utilisateurs_Roles",
	            joinColumns=@JoinColumn(name="ID"),
	            inverseJoinColumns=@JoinColumn(name="ID_ROLE"))
	private Collection<Role> roles;
	
	
	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getIdentification() {
		return identification;
	}


	public void setIdentification(String identification) {
		this.identification = identification;
	}


	public String getTypeId() {
		return typeId;
	}


	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
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


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


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


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	

	public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

public Utilisateur() {
		super();
	}


public Utilisateur(String nom, String prenom, String adresse, String identification, String typeId, String pays, String sexe,
		String email, int tel, String login, String password) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.identification = identification;
	this.typeId = typeId;
	this.pays = pays;
	this.sexe = sexe;
	this.email = email;
	this.tel = tel;
	this.login = login;
	this.password = password;
}

	
	

}
