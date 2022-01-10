package com.psa.flightcheckedin.dto;

public class Reservation {
	private long id;
	private  boolean checkedin;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;
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
		return numberOfBags;
	}
	public void setNumberofbags(int numberofbags) {
		this.numberOfBags = numberofbags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	

}
