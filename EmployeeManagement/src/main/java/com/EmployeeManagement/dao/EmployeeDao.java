package com.EmployeeManagement.dao;

import com.EmployeeManagement.model.Employee;

// interface -> all contracts/features are written below
public interface EmployeeDao {

	void addEmployee();

	Employee searchEmployee(int id);

	boolean deleteEmployee(int id);

	Employee updateEmployee(int id);

	void displayAllEmployee();
}
