package com.pro1.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class fligth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String flightnumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateofdeparture;
	private Timestamp estimateddeparturetime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateofdeparture() {
		return dateofdeparture;
	}
	public void setDateofdeparture(Date dateofdeparture) {
		this.dateofdeparture = dateofdeparture;
	}
	public Timestamp getEstimateddeparturetime() {
		return estimateddeparturetime;
	}
	public void setEstimateddeparturetime(Timestamp estimateddeparturetime) {
		this.estimateddeparturetime = estimateddeparturetime;
	}
	
}
