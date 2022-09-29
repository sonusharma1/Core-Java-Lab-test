/**
 Program : Java program to find Quotient and Remainder(take input).
 @author : Sonu Sharma
 @date   : 8 Sep 2022
 */

public class QuotientRemainder {
    
    // calling main method
    public static void main(String[] args) {
        
        // declaring variable
        int dividend, divisor, quotient, remainder;

        // taking commmand line input
        dividend = Integer.parseInt(args[0]);
        divisor = Integer.parseInt(args[1]);

        // calculating quotient and remainder
        quotient = dividend/divisor;
        remainder = dividend%divisor;

        // printing quotient and remainder
        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+remainder);
    }
}
