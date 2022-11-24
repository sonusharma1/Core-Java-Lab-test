package com.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeDaoTest {

	private EmployeeDao employeeDao;

	@BeforeEach
	void init() {
		employeeDao = new EmployeeDao();
	}

	// positive test case
	@Test
	void incrementOfSalaryCase1() {
		double oldSalary = employeeDao.getEmployee(2).getSalary();
		assertThat((oldSalary * 110 / 100)).isEqualTo(employeeDao.increaseEmployeeSalary(2, 10));
	}

	// negative test case
	@Test
	void incrementOfSalaryCase2() {
		double oldSalary = employeeDao.getEmployee(2).getSalary();
		assertThat((oldSalary * 120 / 100)).isNotEqualTo(employeeDao.increaseEmployeeSalary(2, 10));
	}

}
