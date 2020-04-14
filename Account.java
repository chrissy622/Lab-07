import java.lang.*;
import java.io.*;

public class Account implements IAccount{

    private String accountName;
    protected int accountNumber;
    private double balance;
    protected static int startingAccountNumber = 123456;

    public Account(double bal)
    {
        accountName = "";
        this.accountNumber = startingAccountNumber++;
        balance = bal;
    }

    public Account(Account obj)
    {
        accountName = obj.getAccountName();
        this.accountNumber = obj.getAccountNumber();
        balance = obj.getBalance();
    }


    public static String getVal(String z, int n) {
        return "My name is " + z + " " + n;
    }

    public boolean deposit(double value){
        if(value > 0) {
            balance = balance + value;
            System.out.println(value + " deposited into account:" + getAccountNumber());
            return true;
        }
        return false;
    } //end of method

    public boolean withdraw(double value){
        if(balance > value){
            balance = balance - value;
            System.out.println(value + " withdrawn from account:" + getAccountNumber());
            return true;
        }
        return false;
    }//end of method

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printAccount() {
        System.out.println("    Account #: " + this.accountNumber +
                " balance: " + this.balance);
    }

    public String toString() {
        return "" + this.balance;
    }
}//end of class
