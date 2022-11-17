package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Airline;
import com.util.HibernateUtil;

public class AirlineDao {

	/**
	 * Save Flight
	 * 
	 * @param flight
	 */
	public void saveAirline(Airline airline) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(airline);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
