package com.pehulja.messenger.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="letter_sender_receiver")
public class LetterSenderReceiver extends Pojo implements java.io.Serializable{
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
        
        @Column(name="isSenderDel")
	private boolean _isSenderDel;
	
	@Column(name="isRecDel")
	private boolean _isRecDel;
	
	public LetterSenderReceiver() {
		super();
		// TODO Auto-generated constructor stub
	}

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public RegistredUser getSender() {
        return _Sender;
    }

    public void setSender(RegistredUser _Sender) {
        this._Sender = _Sender;
    }

    public RegistredUser getReceiver() {
        return _Receiver;
    }

    public void setReceiver(RegistredUser _Receiver) {
        this._Receiver = _Receiver;
    }

    public Letter getLetter() {
        return _Letter;
    }

    public void setLetter(Letter _Letter) {
        this._Letter = _Letter;
    }

    public boolean isIsRead() {
        return _isRead;
    }

    public void setIsRead(boolean _isRead) {
        this._isRead = _isRead;
    }

    public boolean isIsSenderTrash() {
        return _isSenderTrash;
    }

    public void setIsSenderTrash(boolean _isSenderTrash) {
        this._isSenderTrash = _isSenderTrash;
    }

    public boolean isIsRecTrash() {
        return _isRecTrash;
    }

    public void setIsRecTrash(boolean _isRecTrash) {
        this._isRecTrash = _isRecTrash;
    }

    public boolean isIsSenderDel() {
        return _isSenderDel;
    }

    public void setIsSenderDel(boolean _isSenderDel) {
        this._isSenderDel = _isSenderDel;
    }

    public boolean isIsRecDel() {
        return _isRecDel;
    }

    public void setIsRecDel(boolean _isRecDel) {
        this._isRecDel = _isRecDel;
    }
	
        
        
        
	
}