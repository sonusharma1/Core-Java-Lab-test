package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.transaction.Transactional;

@Transactional
public class EmployeeDao {

	/**
	 * Save Employee
	 * 
	 * @param employee
	 */
	public void saveEmployee(Employee employee) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(employee);
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
	 * Update Employee
	 * 
	 * @param employee
	 */
	public void updateEmployee(Employee employee) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// save the student object
			session.update(employee);

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
	 * Delete Employee
	 * 
	 * @param id
	 */
	public void deleteEmployee(int id) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a instructor object
			Employee employee = session.get(Employee.class, id);
			if (employee != null) {
				session.delete(employee);
				System.out.println("\n\n");
				System.out.println("\n------------------\nEmployee id " + id
						+ " is deleted successfully :D\n------------------\n");
			} else {
				System.out.println("\n------------------\nid not found\n------------------\n");
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
	 * Get Employee By ID
	 * 
	 * @param id
	 * @return
	 */

	public Employee getEmployee(int id) {

		Transaction transaction = null;
		Employee employee = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an instructor object
			employee = session.get(Employee.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return employee;
	}

	/**
	 * Get all Employee
	 * 
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Employee> getAllEmployee() {

		Transaction transaction = null;
		List<Employee> listOfEmployee = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Create CriteriaBuilder
			CriteriaBuilder builder = session.getCriteriaBuilder();

			// Create CriteriaQuery
			CriteriaQuery<Employee> criteria = builder.createQuery(Employee.class);

			// Specify criteria root
			criteria.from(Employee.class);

			// Execute query
			listOfEmployee = session.createQuery(criteria).getResultList();

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfEmployee;
	}

	/**
	 * Update Employee
	 * 
	 * @param employee
	 */
	public double increaseEmployeeSalary(int id, double percent) {

		Transaction transaction = null;

		Employee employee = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an instructor object
			employee = session.get(Employee.class, id);

			employee.setSalary(employee.getSalary() * (100 + percent) / 100);

			session.update(employee);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return getEmployee(id).getSalary();
	}

}
