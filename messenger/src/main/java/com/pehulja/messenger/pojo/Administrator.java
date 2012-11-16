package com.pehulja.messenger.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.InheritanceType;


@Entity
@Table(name="administrator")
@PrimaryKeyJoinColumn(name="RegistredUser_id")
public class Administrator extends RegistredUser implements Serializable{
	
	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}
}