import java.util.ArrayList;

public class Client implements IClient{

    private String clientName;
    private int clientNumber;   //must be at least 9 digits
    private String address;
    private static int startingClientNumber = 950123456;
    private ArrayList<Account> accountList;


    public Client(String name, String address){
        this.clientName = name;
        this.address = address;
        this.clientNumber = startingClientNumber;
        startingClientNumber++;
        this.accountList = new ArrayList<Account>();

    }

    @Override
    public int openAccount(double balance) {
        Account acc = new Account(balance);
        this.accountList.add(acc);
        return acc.getAccountNumber();
    }

    @Override
    public boolean transfer(int accountFrom, int accountTo, double amount) {
        boolean from = false;
        boolean to = false;

        for(Account a : accountList){
            if(a.getAccountNumber() == accountFrom){
                from = true;
            } else if (a.getAccountNumber() == accountTo){
                to = true;
            }
        }
        if(from & to){
            for(Account a : accountList){
                if(a.getAccountNumber() == accountFrom){
                    a.withdraw(amount);
                } else if (a.getAccountNumber() == accountTo){
                    a.deposit(amount);
                }
            }
            return true;
        }
        System.out.println("Sorry that client and/or account number was not found.");
        return false;

    }

    @Override
    public Account getAccount(int accountNumber) {
        return null;
    }

    @Override
    public void printAccounts() {
        System.out.println("Accounts for  " + this.clientName + " " +this.clientNumber);
        for(Account a : this.accountList) {
            a.printAccount();
        }
    }

    @Override
    public int getClientNumber() {
        return this.clientNumber;
    }

    @Override
    public void deleteAccount(int accountNumber) {
        for(Account a : accountList){
            if(a.getAccountNumber() == accountNumber){
                this.accountList.remove(a);
            }
        }
    }

    public boolean accMatch(int accountNumber){
        for(Account a : accountList)
            if (a.getAccountNumber() == accountNumber){
                return true;
            }
        return false;
    }
    // Add other code here

}//end of class
