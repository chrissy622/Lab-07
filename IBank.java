
public interface IBank {
    /**
     * Opens an account for a new client
     * @param name
     * @param address
     * @param amount
     * @return the account number of the created account
     */
    public int openAccount(String name, String address, double amount);

    /**
     * Opens an account for an existing client
     * @param clientNumber
     * @param amount
     * @return the account number of the created account
     */
    public void openAccount(int clientNumber, double amount);

    public boolean deleteClient(int clientNumber);

    /**
     * Deletes the requested account for this client.
     * @param clientNumber
     * @param accountNumber
     * @return
     */
    public boolean deleteAccount(int clientNumber, int accountNumber);

    //Accounts may be for different clients
    public boolean transfer(int accountFrom, int accountTo, double amount);

    public void printClients();
}