package com.Projet.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projet")
public class Projet {

	@Id @GeneratedValue
	private int id;
	String identifiant;
	private String intitule;
	@OneToMany (mappedBy= "ProM", cascade=CascadeType.ALL)
	private List<Marche> li= new ArrayList<Marche>(); 
	@OneToMany (mappedBy= "ProD", cascade=CascadeType.ALL)
	private List<Devis> lis= new ArrayList<Devis>(); 
	
	
	
	public Projet(String identifiant, String intitule) {
		super();
		this.identifiant = identifiant;
		this.intitule = intitule;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}



	public Projet(int id, String intitule) {
		super();
		this.id = id;
		this.intitule = intitule;
	}

	public Projet(String intitule) {
		super();
		this.intitule = intitule;
	}

	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

}
