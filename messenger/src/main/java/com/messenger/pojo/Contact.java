package com.messenger.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedNativeQueries({
	@NamedNativeQuery(
            name="getUsersContacts",
            query="SELECT *,1 as clazz_ " +
            		"FROM registreduser WHERE registreduser.id IN (SELECT idContactPerson FROM contact WHERE idContactHolder = :id)",
            resultClass=RegistredUser.class
            ),
        @NamedNativeQuery(
            name="deleteUserContact",
            query="DELETE FROM contact WHERE contact.idContactPerson = :idContactPerson AND contact.idContactHolder = :idContactHolder",
            resultClass=RegistredUser.class
        )    
        
    })
@NamedQueries({
    @NamedQuery(
        name="getContactRepeats",
        query="SELECT contact FROM Contact contact WHERE contact.ContactHolder.id=:idHolder AND contact.ContactPerson.id=:idPerson")
})
@Entity
@Table(name="contact")
public class Contact extends Pojo  implements java.io.Serializable{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="idContactHolder")
	private RegistredUser ContactHolder;
	
	@ManyToOne
	@JoinColumn(name="idContactPerson")
	private RegistredUser ContactPerson;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RegistredUser getContactHolder() {
		return ContactHolder;
	}

	public void setContactHolder(RegistredUser contactHolder) {
		ContactHolder = contactHolder;
	}

	public RegistredUser getContactPerson() {
		return ContactPerson;
	}

	public void setContactPerson(RegistredUser contactPerson) {
		ContactPerson = contactPerson;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", ContactHolder=" + ContactHolder
				+ ", ContactPerson=" + ContactPerson + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ContactHolder == null) ? 0 : ContactHolder.hashCode());
		result = prime * result
				+ ((ContactPerson == null) ? 0 : ContactPerson.hashCode());
		result = prime * result + id;
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
		Contact other = (Contact) obj;
		if (ContactHolder == null) {
			if (other.ContactHolder != null)
				return false;
		} else if (!ContactHolder.equals(other.ContactHolder))
			return false;
		if (ContactPerson == null) {
			if (other.ContactPerson != null)
				return false;
		} else if (!ContactPerson.equals(other.ContactPerson))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}