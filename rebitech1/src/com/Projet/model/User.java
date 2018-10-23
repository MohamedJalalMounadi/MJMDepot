package com.Projet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id @GeneratedValue
	private int idUser;
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public User() {
		super();
	}
	private String login ;
	private String  MotdeP;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotdeP() {
		return MotdeP;
	}
	public void setMotdeP(String motdeP) {
		MotdeP = motdeP;
	}
	public User(String login, String motdeP) {
		super();
		this.login = login;
		MotdeP = motdeP;
	}
	

}
