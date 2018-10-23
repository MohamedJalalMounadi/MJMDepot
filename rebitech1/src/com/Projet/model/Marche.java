package com.Projet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Marche")
public class Marche {
	@Id @GeneratedValue
private int idM;
private String identifiantM;
private String intituleM;
private Double MontantM;

@ManyToOne 
private Projet ProM;



public Projet getProM() {
	return ProM;
}

public void setProM(Projet proM) {
	ProM = proM;
}

public Marche(int idM, String identifiantM, String intituleM, Double montantM) {
	super();
	this.idM = idM;
	this.identifiantM = identifiantM;
	this.intituleM = intituleM;
	MontantM = montantM;
	
}

public Marche(String identifiantM, String intituleM, Double montantM, Projet proM) {
	super();
	this.identifiantM = identifiantM;
	this.intituleM = intituleM;
	MontantM = montantM;
	ProM = proM;
}

public Marche() {
	super();
	// TODO Auto-generated constructor stub
}
public int getIdM() {
	return idM;
}
public void setIdM(int idM) {
	this.idM = idM;
}
public String getIdentifiantM() {
	return identifiantM;
}
public void setIdentifiantM(String identifiantM) {
	this.identifiantM = identifiantM;
}
public String getIntituleM() {
	return intituleM;
}
public void setIntituleM(String intituleM) {
	this.intituleM = intituleM;
}
public Double getMontantM() {
	return MontantM;
}
public void setMontantM(Double montantM) {
	MontantM = montantM;
}

}
