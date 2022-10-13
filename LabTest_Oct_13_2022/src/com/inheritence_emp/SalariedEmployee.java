package com.inheritence_emp;

public class SalariedEmployee extends Employee {

	private double monthlyIncentive;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(double monthlyIncentive) {
		super();
		this.monthlyIncentive = monthlyIncentive;
	}

	public double getMonthlyIncentive() {
		return monthlyIncentive;
	}

	public void setMonthlyIncentive(double monthlyIncentive) {
		this.monthlyIncentive = monthlyIncentive;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [monthlyIncentive=" + monthlyIncentive + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getRole()=" + getRole() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
