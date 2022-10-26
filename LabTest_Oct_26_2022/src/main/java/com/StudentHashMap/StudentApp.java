package com.StudentHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class StudentApp {

	HashMap<Integer, Student> studentMap = new HashMap<>();

	// method to add student details into HashMap
	void addStudents() {
		studentMap.put(101, new Student(101, "Sonu", "BSC", 8000));
		studentMap.put(102, new Student(102, "Palis", "BSC", 8500));
		studentMap.put(103, new Student(103, "Pandey", "BSC", 7500));
		studentMap.put(104, new Student(104, "Sujal", "BA", 12000));
		studentMap.put(105, new Student(105, "Lucy", "BCOM", 13500));
	}

	// method to find Student
	void findStudent(int id) {

		// checks student is present or not
		Student foundStudent = studentMap.get(id);

		// if present
		if (foundStudent != null)
			System.out.println(foundStudent);
		else
			System.out.println("Student not found try again :( ");

		System.out.println("\n-----------------------------------------------------------------");
	}

	// main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// creating object
		StudentApp app = new StudentApp();
		app.addStudents();

		// calling method to find student details
		while (true) {
			System.out.println("\nEnter Student ID to be search : ");
			app.findStudent(sc.nextInt());
		}

	}

}
