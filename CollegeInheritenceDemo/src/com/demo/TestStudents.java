package com.demo;

/**
Program : Create a Class student which is inherited by college and school student . Override the method calculate average marks.
@author : Sonu Sharma
@date   : 6 Oct 2022
*/

import java.util.Scanner;

public class TestStudents {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentDetails inputStu = new StudentDetails();

		System.out.println("Select any one.\n1. College Student\n2. School Student");
		int choice = sc.nextInt();
		System.out.println("Enter Number of Students");
		int totalStudents = sc.nextInt();

		switch (choice) {
		case 1:
			inputStu.addCollegeStudents(totalStudents);
			inputStu.printCollegeStudents();
			break;

		case 2:
			inputStu.addSchoolStudents(totalStudents);
			inputStu.printSchoolStudents();
			break;

		default:
			System.out.println("Worng Input");
			break;
		}
	}

}
