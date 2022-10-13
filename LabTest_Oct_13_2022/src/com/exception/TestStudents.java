package com.exception;

import java.util.Scanner;

class StudentFormException extends RuntimeException {

	public StudentFormException(String str) {
		super(str);
	}
}

public class TestStudents {

	public static void main(String[] args) {

		Student stu = new Student();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student ID");
		stu.setId(sc.nextInt());

		System.out.println("Enter Student Name");
		stu.setName(sc.next());

		if (stu.getName() == "") {
			throw new StudentFormException("Student Name cant be NULL...");
		} else if (stu.getName().length() < 3) {
			throw new StudentFormException("Name should not  be less than 3 words");
		}

		System.out.println("Enter Course");
		stu.setCourse(sc.next());

		System.out.println("\nStudent Details added successfully :)\n");
		System.out.println(stu.toString());

	}

}
