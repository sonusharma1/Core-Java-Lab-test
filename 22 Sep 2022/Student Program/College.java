/*
Program : Write a Student and create an array of 10 students and display the students whose marks are more than 90%.
@author : Sonu Sharma
@Date	: 22 Sep 2022
*/
// this class use to store students details
public class College {
    
    //instance variable of student details
    private int id;
    private String name;
    private double marks;

    College() {} //default constructor

    //parameterized constructor to set value of instance variable
    College(int id, String name, double marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //getter method to get marks
    public double getMarks() {
        return this.marks;
    }

    //method to display student details
    public void display() {
        System.out.println(this.id+"  "+this.name+"   "+this.marks+"%");
    }
}
