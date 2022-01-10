package com.psa.flightcheckedin.dto;

public class ReservationUpdateRequest {
	private long id;
	private boolean checkedIn;
	private long numberOfBags;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public long getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(long numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
}
