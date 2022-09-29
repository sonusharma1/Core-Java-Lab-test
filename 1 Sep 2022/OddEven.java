/*
Program: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
         (using arrays)                  	

@author: Sonu Sharma
@Date: 1 Sep Aug 2022
*/

import java.util.Scanner;

public class OddEven {

    static void userInput() {
        Scanner sc = new Scanner(System.in);

        // taking size of array
        System.out.println("\nEnter the number of elements you want to add in Array");
        int arraySize = sc.nextInt();

        // creating array
        int myArray [] = new int[arraySize]; 

        // adding array elements to myArray
        System.out.println("Enter any "+arraySize+" Numbers");
        for (int i = 0; i < arraySize; i++) {            
            myArray[i] = sc.nextInt();
        }

        // calling printOddEven to print sum of odd even 
        printOddEven(myArray);
    }

    // creating a method to print sum of odd and even numbers
    static void printOddEven(int ...myArray){
        int sumOfEven = 0, sumOfOdd = 0;

        // checking if number is odd or even
        for (int i = 0; i < myArray.length; i++) {
            
            if (myArray[i] % 2 == 0) {
                sumOfEven += myArray[i];
            }
            else {
                sumOfOdd += myArray[i];
            }
        }

        System.out.println("\nSum of Even No : "+sumOfEven);
        System.out.println("Sum of Odd No : "+sumOfOdd);
    }

    public static void main(String[] args) {
        // calling method
        userInput();
    }
}
