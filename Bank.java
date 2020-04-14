import java.lang.ref.Cleaner;
import java.util.ArrayList;

public class Bank implements IBank{
    private String name;
    private int bankId;
    private ArrayList<Client> clientList;

    public Bank(String name, int bankId) {
        this.name = name;
        this.bankId = bankId;
        this.clientList = new ArrayList<Client>();

    }


    @Override
    /*
    Creates a new client object and adds it to the clientList arrayList
     */
    public int openAccount(String name, String address, double amount) {
        Client client = new Client(name, address);
        client.openAccount(amount);
        this.clientList.add(client);
        return client.getClientNumber();
    }

    @Override
    /*
    Opens another account for a specific client
     */
    public void openAccount(int clientNumber, double amount) {
        // search for client using clientNumber
        for(Client c : this.clientList) {
            if (c.getClientNumber() == clientNumber) {
                //this.clientList.add(c);
                c.openAccount(amount);
            }
        }
        // add account to client
    } // end of openAccount method

    @Override
    /*
    Prints out all the clients and their accounts in the arrayList "clientList"
     */
    public void printClients() {
        for(Client c : this.clientList) {
            c.printAccounts();
            System.out.println();
        }
    }

    @Override
    /*
    Deletes a client and all of their accounts
     */
    public boolean deleteClient(int clientNumber) {
        for(Client c : this.clientList) {
            if (c.getClientNumber() == clientNumber){
                this.clientList.remove(c);
                return true;
            }
        }
        System.out.println("Sorry we could not find the client corresponding to that client number");
        return false;
    }

    @Override
    /*
    Deletes an account from a specified client
     */
    public boolean deleteAccount(int clientNumber, int accountNumber) {
        for (Client c : this.clientList){
            if(c.getClientNumber() == clientNumber){
                c.deleteAccount(accountNumber);
                return true;
            }
        }
        System.out.println("Sorry that client and/or account number was not found.");
        return false;
    }

    @Override
    /*
    Transfers a double amount between accounts of the same client
     */
    public boolean transfer(int accountFrom, int accountTo, double amount) {
        try{
            for(Client c : this.clientList){
                if (c.accMatch(accountFrom)){
                    c.transfer(accountFrom, accountTo,amount);
                }
            }
        }
        catch (Exception ignored){
            //System.out.println("Sorry that client and/or account number was not found.");
        }
        return false;
    }


}//end of class