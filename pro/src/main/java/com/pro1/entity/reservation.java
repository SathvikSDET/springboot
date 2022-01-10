package com.pro1.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private boolean checkedin;
	private int numberofbags;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "passengerid", nullable = false)
	private passenger passengerid;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fligthid", nullable = false)
	private fligth fligthid;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isCheckedin() {
		return checkedin;
	}
	public void setCheckedin(boolean checkedin) {
		this.checkedin = checkedin;
	}
	public int getNumberofbags() {
		return numberofbags;
	}
	public void setNumberofbags(int numberofbags) {
		this.numberofbags = numberofbags;
	}
	public passenger getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(passenger passengerid) {
		this.passengerid = passengerid;
	}
	public fligth getFligthid() {
		return fligthid;
	}
	public void setFligthid(fligth fligthid) {
		this.fligthid = fligthid;
	}
	
	
	
	

}
