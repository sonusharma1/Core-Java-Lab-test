package com.demo;

public class Student {

	// essential variable required for this project
	private int id;
	private String name;
	private double totalMarksObtained;

	// getter and setter start
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

	public double getTotalMarksObtained() {
		return totalMarksObtained;
	}

	public void setTotalMarksObtained(double totalMarksObtained) {
		this.totalMarksObtained = totalMarksObtained;
	}
	// getter and setter end

	// method to calculate average marks
	protected double percentageMarks() {
		return 0;
	}
}
