package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pilot")
public class Pilot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pilot_id")
	private int pilotId;

	@Column(name = "pilot_name")
	private String pilotName;

	@Column(name = "experience")
	private int experience;

	@OneToOne(mappedBy = "pilot", cascade = CascadeType.ALL)
	private Flight flight;

	public Pilot() {
		super();
	}

	public Pilot(String pilotName, int experience) {
		super();
		this.pilotName = pilotName;
		this.experience = experience;
	}

	public int getPilotId() {
		return pilotId;
	}

	public void setPilotId(int pilotId) {
		this.pilotId = pilotId;
	}

	public String getPilotName() {
		return pilotName;
	}

	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Pilot [pilotId=" + pilotId + ", pilotName=" + pilotName + ", experience=" + experience + ", flight="
				+ flight + "]";
	}

}
