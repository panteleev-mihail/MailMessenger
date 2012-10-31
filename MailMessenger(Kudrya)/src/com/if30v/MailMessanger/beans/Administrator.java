package com.if30v.MailMessanger.beans;

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
import javax.persistence.FetchType;
import javax.persistence.InheritanceType;


@Entity
@Table(name="administrator")
//@PrimaryKeyJoinColumn(name="RegistredUser_id")
public class Administrator implements java.io.Serializable/*extends RegistredUser*/ {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    
    @OneToOne
    @JoinColumn(name="RegistredUser_id")
    private RegistredUser user;
    
    public Administrator() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public RegistredUser get_User() {
        return user;
    }
    public void set_User(RegistredUser user) {
        this.user = user;
    }
}