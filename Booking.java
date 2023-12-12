package com.FlightBooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flights")
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long id;
	
	 private String originating;

	private String destination;
	private String departure;
	private String arrvial;

	private String flightDuration;
	private String flightNumber;
	private String price;
	private String seats;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	
	public String getOriginating() {
		return originating;
	}
	public void setOriginating(String originating) {
		this.originating = originating;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getArrvial() {
		return arrvial;
	}
	public void setArrvial(String arrvial) {
		this.arrvial = arrvial;
	}
	
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	public String getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}

	
}
