/**
 * Program: Java program to print a pattern :	
 * 	
            1		
            12		
            123		
            1234		
            12345

 * @author: Sonu Sharma
 * @date:   25 Aug 2022
 */

 public class PatternDemo {
    
    // creating a method to print pattern
    static void printPattern(){

        int num; // this num will print every time loop start

        // for loop start
        for (int i = 0; i < 5; i++) {
            
            num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num+"  "); // this line will print num in columns
                num++;
            }
            System.out.println();
        }
        // for loop end
    }

    public static void main(String[] args) {
        printPattern(); // calling printPattern method to print number pattern
    }
 }