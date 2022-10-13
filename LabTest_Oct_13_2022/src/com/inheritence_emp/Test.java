package com.inheritence_emp;

import java.util.Scanner;

public class Test {

	static HourlyEmployee hourEmp[];
	static SalariedEmployee salEmp[];

	static void hourlyEmp() {

		Scanner sc = new Scanner(System.in);
		hourEmp = new HourlyEmployee[2];

		// taking input from user
		for (int i = 0; i < hourEmp.length; i++) {

			hourEmp[i] = new HourlyEmployee();
			hourEmp[i].setId(i + 1);

			System.out.println("Enter Name");
			hourEmp[i].setName(sc.next());
			sc.nextLine();
			System.out.println("Enter Role of a employee");
			hourEmp[i].setRole(sc.nextLine());

			System.out.println("Enter total work hours in a week");
			hourEmp[i].setTotalWorkHours(sc.nextDouble());
			hourEmp[i].setSalary();
			System.out.println();
		}

		// displaying employee details
		for (int i = 0; i < hourEmp.length; i++) {

			System.out.println("\nId : " + hourEmp[i].getId());
			System.out.println("Name : " + hourEmp[i].getName());
			System.out.println("Role : " + hourEmp[i].getRole());
			System.out.println("Total Work hr : " + hourEmp[i].getTotalWorkHours());
			System.out.println("Salary : " + hourEmp[i].getSalary() + " rs");
		}
	}

	static void salEmployee() {

		System.out.println("\n------------------------------------------\n");

		Scanner sc = new Scanner(System.in);
		salEmp = new SalariedEmployee[2];

		// taking input from user
		for (int i = 0; i < hourEmp.length; i++) {

			salEmp[i] = new SalariedEmployee();
			salEmp[i].setId(i + 1);

			System.out.println("Enter Name");
			salEmp[i].setName(sc.next());
			sc.nextLine();
			System.out.println("Enter Role of a employee");
			salEmp[i].setRole(sc.nextLine());

			System.out.println("Enter Incentive of this month");
			salEmp[i].setMonthlyIncentive(sc.nextDouble());
			System.out.println("Enter Salary");
			salEmp[i].setSalary(sc.nextDouble());
			System.out.println();
		}

		// displaying employee details
		for (int i = 0; i < hourEmp.length; i++) {

			System.out.println("\nId : " + salEmp[i].getId());
			System.out.println("Name : " + salEmp[i].getName());
			System.out.println("Role : " + salEmp[i].getRole());
			System.out.println("Monthly Incentive : " + salEmp[i].getMonthlyIncentive() + " rs");
			System.out.println("Salary : " + salEmp[i].getSalary() + " rs");
		}
	}

	public static void main(String[] args) {
		hourlyEmp();
		salEmployee();
	}

}
