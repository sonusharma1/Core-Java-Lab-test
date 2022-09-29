/*
Program :  Write a  java program to create a BankAccount and display the people with balance less than 1000.
@author : Sonu Sharma
@Date	: 22 Sep 2022
*/
// this class use to store students details
public class Bank {
    
    //instance variable of customer details
    private int acNo;
    private String name;
    private double balance;

    Bank() {} //default constructor

    //parameterized constructor to set value of instance variable
    Bank(int acNo, String name, double balance) {

        this.acNo = acNo;
        this.name = name;
        this.balance = balance;
    }

    //setter and getter method -> Account Number
    public void setAcNo(int acNo) {
        this.acNo = acNo;
    }
    public int getAcNo() {
        return this.acNo;
    }

    //setter and getter method -> Account Number
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    //setter and getter method -> Account Number
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    //method to display student details
    public void display() {
        System.out.println(this.acNo+"  "+this.name+"   "+this.balance+"rs");
    }

    //method to display those customer whose balance > 1000
}
