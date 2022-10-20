package com.EmployeeManagement.model;

public class Employee {

	// instance variable for employees
	private int id;
	private String name;
	private double salary;

	// default constructor
	public Employee() {
		super();
	}

	// parameterized constructor
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// geeter setter of instance variable
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	// getter setter end

	// method to print employee details
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
