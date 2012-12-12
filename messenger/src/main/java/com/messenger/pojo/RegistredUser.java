package com.messenger.pojo;

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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.if30v.MailMessanger.validators.Validator;
@NamedQueries({
    @NamedQuery(
        name="getUserByLogin",
        query="SELECT user FROM RegistredUser user WHERE user.login=:user_login"),
    @NamedQuery(
        name="getAllusers",
        query="SELECT user FROM RegistredUser user"),
    @NamedQuery(
        name="getAllUsersNotAdmin",
        query="SELECT user FROM RegistredUser user WHERE user not in (SELECT admin.user FROM Administrator admin)"),
    @NamedQuery(
        name="getUserByLoginNotAdmin",
        query="SELECT user FROM RegistredUser user WHERE user.login=:user_login AND user not in (SELECT admin.user FROM Administrator admin)"),
})
@Entity
@Table(name="registreduser")
@Inheritance(strategy=InheritanceType.JOINED)
public class RegistredUser extends Pojo  implements java.io.Serializable{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="FIO")
	private String fIO;
	
	@Column(name="telephone")
	private String telephone;

	@Column(name="dateOfBirth")
	private Date dateOfBirth;
	
	@Column(name="dateOfRegistration")
	private Date dateOfREgistration;
	
	@Column(name="secondMailAdress")
	private String secondMailAdress;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password_hash")
	private String password_hash;
	
	@Column(name="password_salt")
	private String password_salt;
	
	
	
	@OneToMany(mappedBy="Sender" /*,fetch=FetchType.EAGER*/ )
	Collection<LetterSenderReceiver> sendedMails =new ArrayList<LetterSenderReceiver>();
	
	@OneToMany(mappedBy="Receiver" /*,fetch=FetchType.EAGER*/ )
	Collection<LetterSenderReceiver> receivedMails =new ArrayList<LetterSenderReceiver>();
	
	@OneToMany(mappedBy="ContactHolder" /*,fetch=FetchType.EAGER*/ )
	Collection<Contact> holdedContacts =new ArrayList<Contact>();
	
	@OneToMany(mappedBy="ContactPerson" /*,fetch=FetchType.EAGER*/ )
	Collection<Contact> includedInContacts =new ArrayList<Contact>();
	
	public RegistredUser() {
		super();
		// TODO Auto-generated constructor stub
	}


    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getfIO() {
		return fIO;
	}


	public void setfIO(String fIO) {
		this.fIO = fIO;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Date getDateOfREgistration() {
		return dateOfREgistration;
	}


	public void setDateOfREgistration(Date dateOfREgistration) {
		this.dateOfREgistration = dateOfREgistration;
	}


	public String getSecondMailAdress() {
		return secondMailAdress;
	}


	public void setSecondMailAdress(String secondMailAdress) {
		this.secondMailAdress = secondMailAdress;
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


	public Collection<LetterSenderReceiver> getSendedMails() {
		return sendedMails;
	}


	public void setSendedMails(Collection<LetterSenderReceiver> sendedMails) {
		this.sendedMails = sendedMails;
	}


	public Collection<LetterSenderReceiver> getReceivedMails() {
		return receivedMails;
	}


	public void setReceivedMails(Collection<LetterSenderReceiver> receivedMails) {
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
    
    public RegistredUser clone()  {
        RegistredUser user = new RegistredUser();
        user.setDateOfBirth(dateOfBirth);
        user.setDateOfREgistration(dateOfREgistration);
        user.setHoldedContacts(holdedContacts);
        user.setId(id);
        user.setIncludedInContacts(includedInContacts);
        user.setLogin(login);
        user.setPassword_hash(password_hash);
        user.setPassword_salt(password_salt);
        user.setReceivedMails(receivedMails);
        user.setSecondMailAdress(secondMailAdress);
        user.setSendedMails(sendedMails);
        user.setTelephone(telephone);
        user.setfIO(fIO);
        return user;
    }

    @Override
    public String toString() {
        return "RegistredUser{" + "id=" + id + ", login=" + login + ", password_hash=" + password_hash + '}';
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime
				* result
				+ ((dateOfREgistration == null) ? 0 : dateOfREgistration
						.hashCode());
		result = prime * result + ((fIO == null) ? 0 : fIO.hashCode());
		result = prime * result
				+ ((holdedContacts == null) ? 0 : holdedContacts.hashCode());
		result = prime * result + id;
		result = prime
				* result
				+ ((includedInContacts == null) ? 0 : includedInContacts
						.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((password_hash == null) ? 0 : password_hash.hashCode());
		result = prime * result
				+ ((password_salt == null) ? 0 : password_salt.hashCode());
		result = prime * result
				+ ((receivedMails == null) ? 0 : receivedMails.hashCode());
		result = prime
				* result
				+ ((secondMailAdress == null) ? 0 : secondMailAdress.hashCode());
		result = prime * result
				+ ((sendedMails == null) ? 0 : sendedMails.hashCode());
		result = prime * result
				+ ((telephone == null) ? 0 : telephone.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistredUser other = (RegistredUser) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (dateOfREgistration == null) {
			if (other.dateOfREgistration != null)
				return false;
		} else if (!dateOfREgistration.equals(other.dateOfREgistration))
			return false;
		if (fIO == null) {
			if (other.fIO != null)
				return false;
		} else if (!fIO.equals(other.fIO))
			return false;
		if (holdedContacts == null) {
			if (other.holdedContacts != null)
				return false;
		} else if (!holdedContacts.equals(other.holdedContacts))
			return false;
		if (id != other.id)
			return false;
		if (includedInContacts == null) {
			if (other.includedInContacts != null)
				return false;
		} else if (!includedInContacts.equals(other.includedInContacts))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password_hash == null) {
			if (other.password_hash != null)
				return false;
		} else if (!password_hash.equals(other.password_hash))
			return false;
		if (password_salt == null) {
			if (other.password_salt != null)
				return false;
		} else if (!password_salt.equals(other.password_salt))
			return false;
		if (receivedMails == null) {
			if (other.receivedMails != null)
				return false;
		} else if (!receivedMails.equals(other.receivedMails))
			return false;
		if (secondMailAdress == null) {
			if (other.secondMailAdress != null)
				return false;
		} else if (!secondMailAdress.equals(other.secondMailAdress))
			return false;
		if (sendedMails == null) {
			if (other.sendedMails != null)
				return false;
		} else if (!sendedMails.equals(other.sendedMails))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

    	   
}