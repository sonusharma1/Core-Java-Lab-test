/*
Program : Write a program to print the tagline of any 5 Companies (Enhance Switch Case)
@author : Sonu Sharma
@Date   : 15 Sep 2022
*/
import java.util.Scanner;
public class BrandTagline {
    
    // creating mrthod to print the tagline
    static void printTagline(){

        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand Name");
        String brandName = sc.next().toLowerCase();

        // comparing brand name 
        switch(brandName){

			case "adidas"	-> System.out.println("Impossible is Nothing");
			case "puma"	    -> System.out.println("FOREVER FASTER IS ALWAYS FIRST, NEVER SECOND, NEVER THIRD.");
            case "dell"	    -> System.out.println("Innovation that stops at nothing.");
            case "logitech"	-> System.out.println("Get in shape and innovate.");
            case "ktm"	    -> System.out.println("No wasted space or weight - just everything you need for the ultimate ride.");
			default         -> System.out.println("Brand's Name Not found");
		}
    }

    public static void main(String[] args) {

        // calling method to print tag line
        printTagline();
    }
}
