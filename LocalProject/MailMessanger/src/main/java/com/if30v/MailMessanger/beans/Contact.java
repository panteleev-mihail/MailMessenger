package com.if30v.MailMessanger.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int _id;
	
	@ManyToOne
	@JoinColumn(name="idContactHolder")
	private RegistredUser _ContactHolder;
	
	@ManyToOne
	@JoinColumn(name="idContactPerson")
	private RegistredUser _ContactPerson;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public RegistredUser get_ContactHolder() {
		return _ContactHolder;
	}
	public void set_ContactHolder(RegistredUser _ContactHolder) {
		this._ContactHolder = _ContactHolder;
	}
	public RegistredUser get_ContactPerson() {
		return _ContactPerson;
	}
	public void set_ContactPerson(RegistredUser _ContactPerson) {
		this._ContactPerson = _ContactPerson;
	}
	
}