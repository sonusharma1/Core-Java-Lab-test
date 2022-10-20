package com.EmployeeManagement;

import java.util.Scanner;

import com.EmployeeManagement.daoimple.EmployeeDaoImple;
import com.EmployeeManagement.model.Employee;

/**
 * Hello world!
 *
 */
// main method class
public class App {

	// method to print all options
	public static void options() {

		System.out.println("\n-------------------\n      Options\n-------------------\n");
		System.out.println("1. Add Employee");
		System.out.println("2. Search Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Update Employee");
		System.out.println("5. Display all the Employee");
		System.out.println("6. Exit");
	}

	// main method
	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);

			// creating object of EmployeeDaoImple to call its method
			EmployeeDaoImple emp = new EmployeeDaoImple();

			int choice = 0;

			do {

				options(); // calling method to print options
				choice = sc.nextInt();

				switch (choice) {

				// to add Employee Details
				case 1:
					emp.addEmployee();
					System.out.println("Employee added successfully :) ");
					break;

				// to search Employee
				case 2:
					System.out.println("Enter id to be Searched : ");
					Employee foundEmp = emp.searchEmployee(sc.nextInt());

					if (foundEmp != null) {
						System.out.println(foundEmp);
					} else {
						System.out.println("Employee not found");
					}
					break;

				// to delete Employee Details
				case 3:
					System.out.println("Enter id to be deleted : ");
					boolean isdeleted = emp.deleteEmployee(sc.nextInt());

					if (isdeleted) {
						System.out.println("Employee deleted");
					} else {
						System.out.println("Employee not found");
					}
					break;

				// to update Employee Details
				case 4:
					System.out.println("Enter id to be update");
					Employee updatedEmp = emp.updateEmployee(sc.nextInt());

					if (updatedEmp != null) {
						System.out.println("Updated Record : \n" + updatedEmp);
					} else {
						System.out.println("Employee Record not found");
					}
					break;

				// to display all Employee Details
				case 5:
					emp.displayAllEmployee();
					break;

				// to exit from app
				case 6:
					System.exit(0);
					break;

				default:
					System.out.println("Worng Input");
					break;
				}

			} while (choice != 6);

			sc.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
