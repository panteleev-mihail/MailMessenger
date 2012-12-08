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
        query="SELECT user FROM RegistredUser user WHERE user.login=:user_login")
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
	
	
	
	@OneToMany(mappedBy="sender" /*,fetch=FetchType.EAGER*/ )
	Collection<LetterSenderReceiver> sendedMails =new ArrayList<LetterSenderReceiver>();
	
	@OneToMany(mappedBy="receiver" /*,fetch=FetchType.EAGER*/ )
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


	@Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.id;
        hash = 61 * hash + (this.login != null ? this.login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistredUser other = (RegistredUser) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        return true;
    }


	@Override
	public String toString() {
		return "RegistredUser [id=" + id + ", fIO=" + fIO + ", telephone="
				+ telephone + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfREgistration=" + dateOfREgistration
				+ ", secondMailAdress=" + secondMailAdress + ", login=" + login
				+ ", password_hash=" + password_hash + ", password_salt="
				+ password_salt + ", sendedMails=" + sendedMails
				+ ", receivedMails=" + receivedMails + ", holdedContacts="
				+ holdedContacts + ", includedInContacts=" + includedInContacts
				+ "]";
	}
        
        
}