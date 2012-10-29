package com.if30v.MailMessanger.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="letter_sender_receiver")
public class Letter_Sender_Receiver {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int _id;
	
	@ManyToOne
	@JoinColumn(name="idSender")
	private RegistredUser _Sender;
	
	@ManyToOne
	@JoinColumn(name="idReceiver")
	private RegistredUser _Receiver;
	
	@ManyToOne
	@JoinColumn(name="idLetter")
	private Letter _Letter;
	
	@Column(name="isRead")
	private boolean _isRead;
	
	@Column(name="isSenderTrash")
	private boolean _isSenderTrash;
	
	@Column(name="isRecTrash")
	private boolean _isRecTrash;
	
	public Letter_Sender_Receiver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public RegistredUser get_Sender() {
		return _Sender;
	}
	public void set_Sender(RegistredUser _Sender) {
		this._Sender = _Sender;
	}
	public RegistredUser get_Receiver() {
		return _Receiver;
	}
	public void set_Receiver(RegistredUser _Receiver) {
		this._Receiver = _Receiver;
	}
	public Letter get_Letter() {
		return _Letter;
	}
	public void set_Letter(Letter _Letter) {
		this._Letter = _Letter;
	}
	public boolean is_isRead() {
		return _isRead;
	}
	public void set_isRead(boolean _isRead) {
		this._isRead = _isRead;
	}
	public boolean is_isSenderTrash() {
		return _isSenderTrash;
	}
	public void set_isSenderTrash(boolean _isSenderTrash) {
		this._isSenderTrash = _isSenderTrash;
	}
	public boolean is_isRecTrash() {
		return _isRecTrash;
	}
	public void set_isRecTrash(boolean _isRecTrash) {
		this._isRecTrash = _isRecTrash;
	}
	
}