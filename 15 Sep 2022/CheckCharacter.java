/*
Program : Java Program to find whether the character is vovel, consonant, number or special character 
@author : Sonu Sharma
@Date	: 15 Sep 2022
*/
import java.util.Scanner;
public class CheckCharacter {
    
    // creating method to check whether the character is vovel, consonant, number or special character
    static void checkChar() {

        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any charcter");
        char enteredChar = sc.nextLine().charAt(0);
        int asciiValue = enteredChar;

        // checking for number
        if (asciiValue >= 48 && asciiValue <= 57) {
            System.out.println(enteredChar+" is a Number ");
        }

        // checking for alphabate
        else if (asciiValue >= 65 && asciiValue <= 90 || asciiValue >= 97 && asciiValue <= 122) {

            //if enteredChar is aplphabate then converting it to upper case
            char tempUppercase = Character.toUpperCase(enteredChar);

            // checking for vovel
            if (tempUppercase == 'A' || tempUppercase == 'E' || tempUppercase == 'I' || tempUppercase == 'O' || tempUppercase == 'U') {
                System.out.println(enteredChar+" is Vovel");
            }
            else {
                System.out.println(enteredChar+" is Consonant");
            }
        }

        // if none of above then it is a special char
        else {
            System.out.println(enteredChar+" is a Special Character");
        }
    }

    public static void main(String[] args) {

        // calling method to check a character
        checkChar();
    }
}
