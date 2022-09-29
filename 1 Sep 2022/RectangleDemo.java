/*
Program: Create a class named 'Rectangle' with two data members- length and breadth and a function to calculate the area which is 
        'length*breadth'. The class has three constructors which are : 
        1 - having no parameter - values of both length and breadth are assigned zero.		
        2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.		
        3 - having one number as parameter - both length and breadth are assigned that number.		
        Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.

@author: Sonu Sharma
@Date: 1 Sep 2022
*/

class Rectangle {

    // creating instance variable
    private double rectLength, rectBredth;

    // no args constructor ->
    Rectangle() {
        this.rectLength = 0;
        this.rectBredth = 0;
    }

    // parameterized constructor
    Rectangle (Double len, int bre) {
        this.rectLength = len;
        this.rectBredth = bre;
    }

    // CONSTRUCTOR overloading
    Rectangle (double side) {
        this.rectLength = side;
        this.rectBredth = side;
    }

    // creating a method to print area of Rectangle
    void printArea(){
        System.out.println("Length = "+this.rectLength);
        System.out.println("Breadth = "+this.rectBredth);
        System.out.println("Area of Rectangle = "+ this.rectLength * this.rectBredth +"\n");
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        // creating objects of Rectangle class
        Rectangle objRect = new Rectangle();
        Rectangle objRect1 = new Rectangle(5d,6);
        Rectangle objRect2 = new Rectangle(5);

        // calling printArea method to print area 
        objRect.printArea();
        objRect1.printArea();
        objRect2.printArea();
    }
}
