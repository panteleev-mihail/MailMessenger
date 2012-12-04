package com.pehulja.messenger.pojo;

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
	
}