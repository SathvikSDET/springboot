package com.Flight_reservation.web.app.entity;

//import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity
public class reservation  extends AbstractEntity{
	private boolean checkedin;
	private int numberofbags;
	@OneToOne
	private passenger passenger;
	@OneToOne
	private fligth fligth;
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
