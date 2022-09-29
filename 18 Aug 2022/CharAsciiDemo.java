/*
Program: Program to check Character and print its Ascii
@author: Sonu Sharma
@Date: 18 Aug 2022
*/

public class CharAsciiDemo {

    static void checkChar(char user_input) {

        if (Character.isAlphabetic(user_input)) {

            int cal_ascii = user_input;     // to calculate ascii value

            if (user_input == 'a' || user_input =='e' || user_input=='i' || user_input=='o' || user_input=='u') {
                System.out.println(user_input+" is a Vowel and ASCII value = "+cal_ascii);
            }
            else{
                System.out.println(user_input+" is a Consonant and ASCII value = "+cal_ascii);
            }
        }

        else if (Character.isDigit(user_input)) {

            int cal_ascii = user_input;
            System.out.println(user_input+" is a Number and ASCII value = "+cal_ascii);
        }

        else {
            int cal_ascii = user_input;
            System.out.println(user_input+" is a Special Charcter ASCII value"+cal_ascii);
        }
    }

    public static void main(String[] args) {

        char user_char = args[0].charAt(0); // to convert string to char
        checkChar(user_char);
    }
}
