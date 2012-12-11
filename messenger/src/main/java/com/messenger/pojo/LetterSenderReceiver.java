package com.messenger.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
		@NamedQuery(name = "getIncome", query = "SELECT lsr FROM LetterSenderReceiver lsr WHERE lsr.Receiver=:id " +
				"AND lsr.isRecTrash =:isRecTrash"),
		@NamedQuery(name = "getOutcome", query = "SELECT lsr FROM LetterSenderReceiver lsr WHERE lsr.Sender=:id " +
				"AND lsr.isSenderTrash =:isSenderTrash"),
		@NamedQuery(name = "getTrash", query = "SELECT lsr FROM LetterSenderReceiver lsr WHERE (lsr.Receiver=:id " +
				"AND lsr.isRecTrash =:isRecTrash) OR (lsr.Sender=:id AND lsr.isSenderTrash =:isSenderTrash)"),
                @NamedQuery(name = "getByLetter", query = "SELECT lsr FROM LetterSenderReceiver lsr WHERE lsr.letter=:letter ")
})

@Entity
@Table(name="letter_sender_receiver")
public class LetterSenderReceiver extends Pojo implements java.io.Serializable{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="idSender")
	private RegistredUser Sender;
	
	@ManyToOne
	@JoinColumn(name="idReceiver")
	private RegistredUser Receiver;
	
	@ManyToOne
	@JoinColumn(name="idLetter")
	private Letter letter;
	
	@Column(name="isRead")
	private boolean isRead;
	
	@Column(name="isSenderTrash")
	private boolean isSenderTrash;
	
	@Column(name="isRecTrash")
	private boolean isRecTrash;
        
        @Column(name="isSenderDel")
	private boolean isSenderDel;
	
	@Column(name="isRecDel")
	private boolean isRecDel;
	
	public LetterSenderReceiver() {
		super();
		// TODO Auto-generated constructor stub
	}

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public RegistredUser getSender() {
        return Sender;
    }

    public void setSender(RegistredUser _Sender) {
        this.Sender = _Sender;
    }

    public RegistredUser getReceiver() {
        return Receiver;
    }

    public void setReceiver(RegistredUser _Receiver) {
        this.Receiver = _Receiver;
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter _Letter) {
        this.letter = _Letter;
    }

    public boolean isIsRead() {
        return isRead;
    }

    public void setIsRead(boolean _isRead) {
        this.isRead = _isRead;
    }

    public boolean isIsSenderTrash() {
        return isSenderTrash;
    }

    public void setIsSenderTrash(boolean _isSenderTrash) {
        this.isSenderTrash = _isSenderTrash;
    }

    public boolean isIsRecTrash() {
        return isRecTrash;
    }

    public void setIsRecTrash(boolean _isRecTrash) {
        this.isRecTrash = _isRecTrash;
    }

    public boolean isIsSenderDel() {
        return isSenderDel;
    }

    public void setIsSenderDel(boolean _isSenderDel) {
        this.isSenderDel = _isSenderDel;
    }

    public boolean isIsRecDel() {
        return isRecDel;
    }

    public void setIsRecDel(boolean _isRecDel) {
        this.isRecDel = _isRecDel;
    }
	
        
        
        
	
}