package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Flight;
import com.util.HibernateUtil;

public class FlightDao {

	/**
	 * Save Flight
	 * 
	 * @param flight
	 */
	public void saveFlight(Flight flight) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(flight);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Update Flight
	 * 
	 * @param flight
	 */
	public void updateFlight(Flight flight) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// save the student object
			session.update(flight);

			// commit transaction
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Delete Flight
	 * 
	 * @param id
	 */
	public void deleteFlight(int id) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a instructor object
			Flight flight = session.get(Flight.class, id);
			if (flight != null) {
				session.delete(flight);
				System.out.println("instructor is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Get Flight By ID
	 * 
	 * @param id
	 * @return
	 */
	public Flight getFlight(int id) {

		Transaction transaction = null;
		Flight flight = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an instructor object
			flight = session.get(Flight.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return flight;
	}

	/**
	 * Get all Instructors
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Flight> getAllFlight() {

		Transaction transaction = null;
		List<Flight> listOfFlights = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an instructor object

			listOfFlights = session.createQuery("from Instructor").getResultList();

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfFlights;
	}
}
