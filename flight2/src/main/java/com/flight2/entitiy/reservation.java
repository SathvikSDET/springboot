package com.flight2.entitiy;


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
	private passenger passenger;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fligthid", nullable = false)
	private fligth fligth;
	
	
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
	public passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(passenger passenger) {
		this.passenger = passenger;
	}
	public fligth getFligth() {
		return fligth;
	}
	public void setFligth(fligth fligth) {
		this.fligth = fligth;
	}
	
	
	

}
