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
	private int _id;
	
	@Column(name="senderEmail")
	private String _senderEmail;
	
	@Column(name="content")
	private String _content;
	
	@Column(name="theme")
	private String _theme;
	
	@Column(name="receiverEmail")
	private String _receiverEmail;
	
	
	@OneToMany(mappedBy="_Letter" /*,fetch=FetchType.EAGER*/ )
	Collection<LetterSenderReceiver> letter_Sender_Receivers =new ArrayList<LetterSenderReceiver>();
	
	public Letter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_senderEmail() {
		return _senderEmail;
	}
	public void set_senderEmail(String _senderEmail) {
		this._senderEmail = _senderEmail;
	}
	public String get_content() {
		return _content;
	}
	public void set_content(String _content) {
		this._content = _content;
	}
	public String get_theme() {
		return _theme;
	}
	public void set_theme(String _theme) {
		this._theme = _theme;
	}
	public String get_receiverEmail() {
		return _receiverEmail;
	}
	public void set_receiverEmail(String _receiverEmail) {
		this._receiverEmail = _receiverEmail;
	}
	public Collection<LetterSenderReceiver> getLetter_Sender_Receivers() {
		return letter_Sender_Receivers;
	}
	public void setLetter_Sender_Receivers(
			Collection<LetterSenderReceiver> letter_Sender_Receivers) {
		this.letter_Sender_Receivers = letter_Sender_Receivers;
	}
	
}