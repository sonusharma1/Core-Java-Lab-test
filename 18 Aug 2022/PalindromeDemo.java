/*
Program: Program to check Palindrome
@author: Sonu Sharma
@Date: 18 Aug 2022
*/

public class PalindromeDemo {

    static void calPalindrome(int user_num) {

        int old_number = user_num;
        int rev = 0;

        while (user_num > 0) {
            rev = (rev * 10) + user_num % 10;
            user_num = user_num / 10;
        }

        if (old_number == rev) {
            System.out.println(old_number + " is a Palindrome");
        } else {
            System.out.println(old_number + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        calPalindrome(num);
    }
}
