/**
 * Program: Remove Duplicates elements from an Array
 * @author: Sonu Sharma
 * @date:   25 Aug 2022
 */

import java.util.*;
public class DuplicateArray {

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

        // calling removeDuplicates to remove duplicate entries in an array
        removeDuplicates(myArray);        
    }

    // removeDuplicates is a method to delete duplicate elements in array
    static void removeDuplicates(int ...newArray) {
        Arrays.sort(newArray);

        int j=0;

        // for loop for swaping columns
        for (int i = 0; i < newArray.length-1; i++) {
            if (newArray[i] != newArray[i+1]) {
                newArray[j] = newArray[i];
                j++; 
            }
        }

        // adding last element to newArray
        newArray[j] = newArray[newArray.length-1];

        System.out.println("\n--------------------------\n");
        System.out.println("New Array :\n");
        for (int i = 0; i <= j; i++) {
            System.out.print(newArray[i]+"  |  ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        
        arrayInput();
    }
}
