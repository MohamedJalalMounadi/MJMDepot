package com.Projet.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "devis")
public class Devis {
	@Id @GeneratedValue
	private int id ; 
private	String identifiantD;
	private String etatD;
	private double montantD;
	private String designationD;
	@OneToMany (mappedBy= "Devi", cascade=CascadeType.ALL)

	@ManyToOne 
	private Projet ProD;
	
	public Devis() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Devis(int id, String identifiantD, String etatD, double montantD, String designationD,
			Projet proD) {
		super();
		this.id = id;
		this.identifiantD = identifiantD;
		this.etatD = etatD;
		this.montantD = montantD;
		this.designationD = designationD;
	
		ProD = proD;
	}

	public Devis(String identifiantD, String etatD, double montantD, String designationD, Projet proD) {
		super();
		this.identifiantD = identifiantD;
		this.etatD = etatD;
		this.montantD = montantD;
		this.designationD = designationD;
		ProD = proD;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentifiantD() {
		return identifiantD;
	}
	public void setIdentifiantD(String identifiantD) {
		this.identifiantD = identifiantD;
	}
	public String getEtatD() {
		return etatD;
	}
	public void setEtatD(String etatD) {
		this.etatD = etatD;
	}
	public double getMontantD() {
		return montantD;
	}
	public void setMontantD(double montantD) {
		this.montantD = montantD;
	}
	public String getDesignationD() {
		return designationD;
	}
	public void setDesignationD(String designationD) {
		this.designationD = designationD;
	}

	public Projet getProD() {
		return ProD;
	}
	public void setProD(Projet proD) {
		ProD = proD;
	}


	
	
	
}
