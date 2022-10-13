package com.exception;

class FieldCantBeNull extends Exception {

	public FieldCantBeNull(String str) {
		super(str);
	}
}

public class TestStudents {

	public static void main(String[] args) {

		try {

			Student s = new Student(1, "", "BSC");
			System.out.println(s.toString());
			throw new FieldCantBeNull("ID and Name cant be NULL");

		} catch (FieldCantBeNull e) {

		}
	}

}
