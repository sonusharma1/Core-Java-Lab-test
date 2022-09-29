/**
 Program : Write a java program to calculate simple interest(SI =PxRxt/100).
 @author : Sonu Sharma
 @date   : 8 Sep 2022
 */

public class SimpleInterest {

    // creating method to calculate simple interest 
    static void calSimpleInterest(int principal, double rate, double time) {

        // calculating simple interest
        double simpleInterest = principal * rate * time / 100;

        // printing simple interest
        System.out.println("Simple Interest = "+simpleInterest);

    }
    
    public static void main(String[] args) {

        // taking command line input
        double rate = Double.parseDouble(args[0]);
        double time = Double.parseDouble(args[1]);

        // calling method to calculate simple interest 
        calSimpleInterest(10000, rate, time);
    }
}
