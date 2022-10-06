package com.demo;

public class College extends Student {

	@Override
	public double percentageMarks() {

		// calculating percentage
		return (this.getTotalMarksObtained() * 100) / 650;
	}

	// method to calculate CGPA
	public double calculateCgpa() {

		int cgpa = (int) (percentageMarks() / 100 * 9.5);
		return cgpa;
	}
}
