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
				"AND lsr.isRecTrash =:isRecTrash AND lsr.isRecDel =:isRecDel ORDER BY id"),
		@NamedQuery(name = "getOutcome", query = "SELECT lsr FROM LetterSenderReceiver lsr WHERE lsr.Sender=:id " +
				"AND lsr.isSenderTrash =:isSenderTrash AND lsr.isSenderDel =:isSenderDel ORDER BY id"),
		@NamedQuery(name = "getTrash", query = "SELECT lsr FROM LetterSenderReceiver lsr WHERE (lsr.Receiver=:id " +
				"AND lsr.isRecTrash =:isRecTrash AND lsr.isRecDel =:isRecDel) OR " +
				"(lsr.Sender=:id AND lsr.isSenderTrash =:isSenderTrash AND lsr.isSenderDel =:isSenderDel) ORDER BY id"),
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Receiver == null) ? 0 : Receiver.hashCode());
		result = prime * result + ((Sender == null) ? 0 : Sender.hashCode());
		result = prime * result + id;
		result = prime * result + (isRead ? 1231 : 1237);
		result = prime * result + (isRecDel ? 1231 : 1237);
		result = prime * result + (isRecTrash ? 1231 : 1237);
		result = prime * result + (isSenderDel ? 1231 : 1237);
		result = prime * result + (isSenderTrash ? 1231 : 1237);
		result = prime * result + ((letter == null) ? 0 : letter.hashCode());
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
		LetterSenderReceiver other = (LetterSenderReceiver) obj;
		if (Receiver == null) {
			if (other.Receiver != null)
				return false;
		} else if (!Receiver.equals(other.Receiver))
			return false;
		if (Sender == null) {
			if (other.Sender != null)
				return false;
		} else if (!Sender.equals(other.Sender))
			return false;
		if (id != other.id)
			return false;
		if (isRead != other.isRead)
			return false;
		if (isRecDel != other.isRecDel)
			return false;
		if (isRecTrash != other.isRecTrash)
			return false;
		if (isSenderDel != other.isSenderDel)
			return false;
		if (isSenderTrash != other.isSenderTrash)
			return false;
		if (letter == null) {
			if (other.letter != null)
				return false;
		} else if (!letter.equals(other.letter))
			return false;
		return true;
	}
	
        
        
        
	
}