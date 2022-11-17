package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Pilot;
import com.util.HibernateUtil;

public class PilotDao {

	/**
	 * Save Flight
	 * 
	 * @param flight
	 */
	public void savePilot(Pilot pilot) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(pilot);
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
