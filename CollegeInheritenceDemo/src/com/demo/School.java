package com.demo;

public class School extends Student {

	@Override
	public double percentageMarks() {

		// calculating percentage
		return (this.getTotalMarksObtained() * 100) / 550;
	}

	// to calculate pass class
	public String printResult() {

		double percentage = percentageMarks();
		String passClass = "";

		if (percentage >= 60) {
			passClass = "First Class";
		} else if (percentage < 60 && percentage >= 50) {
			passClass = "Second Class";
		} else if (percentage < 50 && percentage >= 40) {
			passClass = "Third Class";
		}

		return passClass;
	}
}
