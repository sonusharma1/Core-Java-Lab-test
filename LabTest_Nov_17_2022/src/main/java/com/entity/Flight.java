package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_Id")
	private int flightId;

	@Column(name = "departure_time")
	private String departureTime;

	@Column(name = "arival_time")
	private String arivalTime;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pilot_id")
	private Pilot pilot;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "airline_id")
	private Airline airline;

	public Flight() {
		super();
	}

	public Flight(String departureTime, String arivalTime) {
		super();
		this.departureTime = departureTime;
		this.arivalTime = arivalTime;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArivalTime() {
		return arivalTime;
	}

	public void setArivalTime(String arivalTime) {
		this.arivalTime = arivalTime;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", departureTime=" + departureTime + ", arivalTime=" + arivalTime
				+ ", pilot=" + pilot + ", airline=" + airline + "]";
	}

}
