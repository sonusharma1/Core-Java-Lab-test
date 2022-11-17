package com.flight.flightmanagement;

import com.dao.FlightDao;
import com.entity.Airline;
import com.entity.Flight;
import com.entity.Pilot;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Save two instructors
		Flight flight = new Flight("00:15", "01:45");
		Pilot pilot = new Pilot("Sonu Sharma", 4);

		pilot.setFlight(flight);
		flight.setPilot(pilot);

		Airline airline = new Airline("Air India", "AIC");
		airline.setFlight(flight);
		flight.setAirline(airline);

		FlightDao flightDao = new FlightDao();
		flightDao.saveFlight(flight);

//		List<Airline> airlinesList = new ArrayList<>();
//		Airline airline = new Airline("Air India", "AIC");
//		airline.setFlight(flight);
//		airlinesList.add(airline);
//
//		AirlineDao airlineDao = new AirlineDao();
//		airlineDao.saveAirline(airline);

	}
}
