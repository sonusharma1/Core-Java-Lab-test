/*
Program :       *
               * *
              * * *
             * * * *  
@author : Sonu Sharma
@Date	: 15 Sep 2022
*/
import java.util.Scanner;
public class PrintPattern {

    // creating method to print a triangle pattern
    static void trianglePattern() {

        // taking no. of rows user want to print
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int num = sc.nextInt();

        //this block is for printing no. of rows
        int row = 0;
        while (++row <= num) {

            //this block is for printing no of space in a row
            int space = num - row + 1;
            while (--space > 0) {
                System.out.print(" ");
            }
            
            //this block is for printing no of columns in a row
            int col = 0;
            while (++col <= row) {   
                System.out.print(" *");
            }

            // to print each column in next line
            System.out.println(); 
        }
    }
    
    public static void main(String[] args) {
        
        // calling method to print a triangle pattern
        trianglePattern();
    }
}
