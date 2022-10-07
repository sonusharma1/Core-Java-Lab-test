package com.demo;

import java.util.Scanner;

public class StudentDetails {

	Scanner sc = new Scanner(System.in);

	College collegeStu[];
	School schoolStu[];

	// college student details start
	void addCollegeStudents(int totalStudents) {

		collegeStu = new College[totalStudents];

		for (int i = 0; i < collegeStu.length; i++) {

			collegeStu[i] = new College();

			collegeStu[i].setId(i);

			System.out.println("\nEnter Student Name");
			collegeStu[i].setName(sc.next());

			System.out.println("\nEnter Total Obtained Marks out of 650");
			collegeStu[i].setTotalMarksObtained(sc.nextDouble());
		}
	}

	void printCollegeStudents() {

		System.out.println("\n--------------------------------\nCollege Student Details\n-------------------------------");

		System.out.println();
		for (int i = 0; i < collegeStu.length; i++) {
			System.out.println("ID : " + collegeStu[i].getId() + "\nName : " + collegeStu[i].getName() + "\nTotal Marks Obtained : "
					+ collegeStu[i].getTotalMarksObtained());
			System.out.println("Percentage : " + String.format("%.4g%n", collegeStu[i].percentageMarks()) + "CGPA : "
					+ String.format("%.3g%n", collegeStu[i].calculateCgpa()));
		}
	}
	// college student details end

	// School student details start
	void addSchoolStudents(int totalStudents) {

		schoolStu = new School[totalStudents];

		for (int i = 0; i < schoolStu.length; i++) {

			schoolStu[i] = new School();

			schoolStu[i].setId(i);

			System.out.println("\nEnter Student Name");
			schoolStu[i].setName(sc.next());

			System.out.println("\nEnter Total Obtained Marks out of 550");
			schoolStu[i].setTotalMarksObtained(sc.nextDouble());
		}
	}

	void printSchoolStudents() {

		System.out.println("\n--------------------------------\nSchool Student Details\n-------------------------------");

		System.out.println();
		for (int i = 0; i < schoolStu.length; i++) {
			System.out.println("ID : " + schoolStu[i].getId() + "\nName : " + schoolStu[i].getName() + "\nTotal Marks Obtained : "
					+ schoolStu[i].getTotalMarksObtained());
			System.out.println("Percentage : " + String.format("%.4g%n", schoolStu[i].percentageMarks()) + "Pass Class : "
					+ schoolStu[i].printResult());
			System.out.println();
		}
	}
	// School student details end
}
