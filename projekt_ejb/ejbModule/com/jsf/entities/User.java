package com.jsf.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@Table(name = "user")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;

	@Temporal(TemporalType.DATE)
	private Date data_urodzenia;

	@Column(length = 60)
	private String imie;

	@Column(length = 60)
	private String nazwisko;

	public void log(String text) {
		System.out.println(text + ": [" + id + "], " + imie + ", " + nazwisko + ", " + data_urodzenia);
	}
	
	public User() {
	}

	public Integer getIdperson() {
		return this.id;
	}

	public void setIdperson(Integer idperson) {
		this.id = idperson;
	}

	public Date getBirthdate() {
		return this.data_urodzenia;
	}

	public void setBirthdate(Date birthdate) {
		this.data_urodzenia = birthdate;
	}

	public String getName() {
		return this.imie;
	}

	public void setName(String name) {
		this.imie = name;
	}

	public String getSurname() {
		return this.nazwisko;
	}

	public void setSurname(String surname) {
		this.nazwisko = surname;
	}

}