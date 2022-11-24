package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Project;
import com.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.transaction.Transactional;

@Transactional
public class ProjectDao {

	/**
	 * Save Project
	 * 
	 * @param Project
	 */
	public void saveProject(Project project) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(project);
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
	 * Update Project
	 * 
	 * @param Project
	 */
	public void updateProject(Project project) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// save the student object
			session.update(project);

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
	 * Delete Project
	 * 
	 * @param id
	 */
	public void deleteProject(int id) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a instructor object
			Project project = session.get(Project.class, id);
			if (project != null) {
				session.delete(project);
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
	 * Get Project By ID
	 * 
	 * @param id
	 * @return
	 */

	public Project getProject(int id) {

		Transaction transaction = null;
		Project project = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an instructor object
			project = session.get(Project.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return project;
	}

	/**
	 * Get all Project
	 * 
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Project> getAllProject() {

		Transaction transaction = null;
		List<Project> listOfProjects = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Create CriteriaBuilder
			CriteriaBuilder builder = session.getCriteriaBuilder();

			// Create CriteriaQuery
			CriteriaQuery<Project> criteria = builder.createQuery(Project.class);

			// Specify criteria root
			criteria.from(Project.class);

			// Execute query
			listOfProjects = session.createQuery(criteria).getResultList();

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfProjects;
	}

}
