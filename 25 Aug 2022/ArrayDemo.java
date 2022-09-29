/**
 * Program: Java program to find the largest and second largest number in an array 
 * @author: Sonu Sharma
 * @date:   25 Aug 2022
 */

import java.util.*;

 public class ArrayDemo {
    
    // arrayInput is a method to creating and storing array data
    static void arrayInput() {

        Scanner sc = new Scanner(System.in);

        // taking size of array
        System.out.println("\nEnter the number of elements you want to add in Array");
        int arraySize = sc.nextInt();

        // creating array
        int myArray [] = new int[arraySize]; 

        // adding array elements to myArray
        System.out.println("Enter "+arraySize+" Array Elements");
        for (int i = 0; i < arraySize; i++) {
            
            myArray[i] = sc.nextInt();
        }

        // calling sortAscendingArray to sort a myArray
        sortAscendingArray(myArray);        
    }

    // sortAscendingArray is a method to sort array in ascending order
    static void sortAscendingArray(int ...sortedArray) {

        int temp = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i+1 ; j < sortedArray.length; j++) {
                
                if (sortedArray[i] > sortedArray[j]) {
                    
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        printOperations(sortedArray.length, sortedArray);
    }


    // it is a method to print largest and second largest number in myArray
    static void printOperations(int arraySize, int ...sortedArray ) {
        
        // printing sorted array
        System.out.println("--------------------------\n");
        System.out.println("Ascending Order\n");
        for (int i : sortedArray) {
            System.out.print(i+"  |  ");
        }
        System.out.println();

        // printing largest and second largest number in array
        System.out.println("--------------------------\n");
        System.out.println("Largest Number is : "+sortedArray[arraySize-1]);
        System.out.println("Second Largest Number is : "+sortedArray[arraySize-2]);
        System.out.println("Shortest Number is : "+sortedArray[0]);
        System.out.println("Second Shortest Number is : "+sortedArray[1]);
    }

    

    public static void main(String[] args) {
       
        arrayInput();   // calling arrayInput method to take input
    }
 }

