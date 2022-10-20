package com.EmployeeManagement.daoimple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagement.model.Employee;

// class to implements all methods of EmployeeDao Interface
public class EmployeeDaoImple implements EmployeeDao {

	Scanner sc = new Scanner(System.in);

	// ArrayList to store all employees
	List<Employee> empList = new ArrayList<>();

	// method to add employee into ArrayList
	@Override
	public void addEmployee() {

		Employee employee = new Employee();

		// taking input
		System.out.println("Enter Employee ID : ");
		employee.setId(sc.nextInt());
		System.out.println("Enter Employee Name : ");
		employee.setName(sc.next());
		System.out.println("Enter Employee Slaray : ");
		employee.setSalary(sc.nextDouble());

		// adding employee details into ArrayList
		empList.add(employee);
	}

	// method to search/find employee from ArrayList
	@Override
	public Employee searchEmployee(int id) {

		// object to store found employee
		Employee foundEmp = null;

		// iterating into ArrayList
		for (Employee employee : empList) {

			if (employee.getId() == id) {

				// store found employee into foundEmp object
				foundEmp = employee;
			}
		}
		return foundEmp;
	}

	// method to delete employee from ArrayList
	@Override
	public boolean deleteEmployee(int id) {

		// calling method to find employee
		Employee foundEmp = searchEmployee(id);
		boolean isDeleted = false;

		// if employee found
		if (foundEmp != null) {

			// deleting employee
			empList.remove(foundEmp);
			isDeleted = true;
		}
		return isDeleted;
	}

	// method to update employee details in ArrayList
	@Override
	public Employee updateEmployee(int id) {

		// calling method to find employee
		Employee foundEmp = searchEmployee(id);

		// if employee found
		if (foundEmp != null) {

			System.out.println("\nWhat do you want to update ? : \n1. Name\n2. Salray");
			int choice = sc.nextInt();

			switch (choice) {

			// to update employee name
			case 1:
				System.out.println("Enter new name : ");
				foundEmp.setName(sc.next());
				break;

			// to update employee salary
			case 2:
				System.out.println("Enter new Salary : ");
				foundEmp.setSalary(sc.nextDouble());
				break;

			default:
				System.out.println("Wrong input, try again ");
				break;
			}
		}
		return foundEmp;
	}

	// method to display all employee details from ArrayList
	@Override
	public void displayAllEmployee() {
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}

}
