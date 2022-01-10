package com.Flight_reservation.web.app.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;


@Entity
public class fligth extends AbstractEntity {
	private String flightnumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateofdeparture;
	private Timestamp estimated_departure_time;
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
	public Timestamp getEstimated_departure_time() {
		return estimated_departure_time;
	}
	public void setEstimated_departure_time(Timestamp estimated_departure_time) {
		this.estimated_departure_time = estimated_departure_time;
	}
	
	
}

