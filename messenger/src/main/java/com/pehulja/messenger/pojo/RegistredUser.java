package com.pehulja.messenger.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.if30v.MailMessanger.validators.Validator;

@Entity
@Table(name="registreduser")

@Inheritance(strategy=InheritanceType.JOINED)
public class RegistredUser implements java.io.Serializable{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int _id;
	
	@Column(name="FIO")
	private String _fIO;
	
	@Column(name="telephone")
	private String _telephone;

	@Column(name="dateOfBirth")
	private Date _dateOfBirth;
	
	@Column(name="dateOfRegistration")
	private Date _dateOfREgistration;
	
	@Column(name="secondMailAdress")
	private String _secondMailAdress;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password_hash")
	private String password_hash;
	
	@Column(name="password_salt")
	private String password_salt;
	
	
	
	@OneToMany(mappedBy="_Sender" /*,fetch=FetchType.EAGER*/ )
	Collection<Letter_Sender_Receiver> sendedMails =new ArrayList<Letter_Sender_Receiver>();
	
	@OneToMany(mappedBy="_Receiver" /*,fetch=FetchType.EAGER*/ )
	Collection<Letter_Sender_Receiver> receivedMails =new ArrayList<Letter_Sender_Receiver>();
	
	@OneToMany(mappedBy="_ContactHolder" /*,fetch=FetchType.EAGER*/ )
	Collection<Contact> holdedContacts =new ArrayList<Contact>();
	
	@OneToMany(mappedBy="_ContactPerson" /*,fetch=FetchType.EAGER*/ )
	Collection<Contact> includedInContacts =new ArrayList<Contact>();
	
	public RegistredUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_fIO() {
		return _fIO;
	}
	public void set_fIO(String _fIO) {
		this._fIO = _fIO;
	}
	public String get_telephone() {
		return _telephone;
	}
	public void set_telephone(String _telephone) {
		this._telephone = _telephone;
	}
	public Date get_dateOfBirth() {
		return _dateOfBirth;
	}
	public void set_dateOfBirth(Date _dateOfBirth) {
		this._dateOfBirth = _dateOfBirth;
	}
	public Date get_dateOfREgistration() {
		return _dateOfREgistration;
	}
	public void set_dateOfREgistration(Date _dateOfREgistration) {
		this._dateOfREgistration = _dateOfREgistration;
	}
	public String get_secondMailAdress() {
		return _secondMailAdress;
	}
	public void set_secondMailAdress(String _secondMailAdress) {
		this._secondMailAdress = _secondMailAdress;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword_hash() {
		return password_hash;
	}
	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}
	public String getPassword_salt() {
		return password_salt;
	}
	public void setPassword_salt(String password_salt) {
		this.password_salt = password_salt;
	}
	public Collection<Letter_Sender_Receiver> getSendedMails() {
		return sendedMails;
	}
	public void setSendedMails(Collection<Letter_Sender_Receiver> sendedMails) {
		this.sendedMails = sendedMails;
	}
	public Collection<Letter_Sender_Receiver> getReceivedMails() {
		return receivedMails;
	}
	public void setReceivedMails(Collection<Letter_Sender_Receiver> receivedMails) {
		this.receivedMails = receivedMails;
	}
	public Collection<Contact> getHoldedContacts() {
		return holdedContacts;
	}
	public void setHoldedContacts(Collection<Contact> holdedContacts) {
		this.holdedContacts = holdedContacts;
	}
	public Collection<Contact> getIncludedInContacts() {
		return includedInContacts;
	}
	public void setIncludedInContacts(Collection<Contact> includedInContacts) {
		this.includedInContacts = includedInContacts;
	}
}