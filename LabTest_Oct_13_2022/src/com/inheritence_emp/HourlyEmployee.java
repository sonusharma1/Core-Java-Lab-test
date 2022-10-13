package com.inheritence_emp;

public class HourlyEmployee extends Employee {

	private double totalWorkHours;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(double totalWorkHours) {
		super();
		this.totalWorkHours = totalWorkHours;
	}

	public double getTotalWorkHours() {
		return totalWorkHours;
	}

	public void setTotalWorkHours(double totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}

	public void setSalary() {
		double salary = 850 * this.totalWorkHours; // assumed 850rs/hr is wages in a company
		super.setSalary(salary);
	}

	@Override
	public String toString() {
		return "HourlyEmployee [totalWorkHours=" + totalWorkHours + ", getId()=" + getId() + ", getName()=" + getName() + ", getRole()="
				+ getRole() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
