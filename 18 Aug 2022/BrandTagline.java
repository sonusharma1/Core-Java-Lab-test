/*
Program: Program to check Character and print its Ascii
@author: Sonu Sharma
@Date: 18 Aug 2022
*/

public class BrandTagline {
    
    static void printTagline(String brand){

        switch(brand){

			case "adidas"	-> System.out.println("Impossible is Nothing");
			case "puma"	    -> System.out.println("FOREVER FASTER IS ALWAYS FIRST, NEVER SECOND, NEVER THIRD.");
            case "dell"	    -> System.out.println("Innovation that stops at nothing.");
            case "logitech"	-> System.out.println("Get in shape and innovate.");
            case "ktm"	    -> System.out.println("No wasted space or weight - just everything you need for the ultimate ride.");
			default         -> System.out.println("Brand Not found");
		}
    }

    public static void main(String[] args) {

        String brand_name = args[0];
        printTagline(brand_name);
    }
}
