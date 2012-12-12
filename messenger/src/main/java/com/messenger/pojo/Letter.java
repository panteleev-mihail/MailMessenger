package com.messenger.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedNativeQueries({
	@NamedNativeQuery(
            name="getLettersSenderReceiver",
            query="SELECT *,1 as clazz_ " +
            		"FROM letter_sender_receiver WHERE idLetter = :id)",
            resultClass=RegistredUser.class
            )
    })

@Entity
@Table(name="letter")
public class Letter extends Pojo  implements java.io.Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
		
	@Column(name="content")
	private String content;
	
	@Column(name="theme")
	private String theme;
	
		
	
	@OneToMany(mappedBy="letter" /*,fetch=FetchType.EAGER*/ )
	Collection<LetterSenderReceiver> letterSenderReceivers =new ArrayList<LetterSenderReceiver>();
	
	public Letter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Collection<LetterSenderReceiver> getLetterSenderReceivers() {
		return letterSenderReceivers;
	}

	public void setLetterSenderReceivers(
			Collection<LetterSenderReceiver> letterSenderReceivers) {
		this.letterSenderReceivers = letterSenderReceivers;
	}

	@Override
	public String toString() {
		return "Letter [id=" + id + ", content=" + content + ", theme=" + theme
				+ ", letterSenderReceivers=" + letterSenderReceivers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + id;
		result = prime
				* result
				+ ((letterSenderReceivers == null) ? 0 : letterSenderReceivers
						.hashCode());
		result = prime * result + ((theme == null) ? 0 : theme.hashCode());
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
		Letter other = (Letter) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (id != other.id)
			return false;
		if (letterSenderReceivers == null) {
			if (other.letterSenderReceivers != null)
				return false;
		} else if (!letterSenderReceivers.equals(other.letterSenderReceivers))
			return false;
		if (theme == null) {
			if (other.theme != null)
				return false;
		} else if (!theme.equals(other.theme))
			return false;
		return true;
	}
	
}