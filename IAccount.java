public interface IAccount {
    public boolean deposit(double amount);
    public boolean withdraw(double amount);
    public int getAccountNumber();
    public void setAccountNumber(int accountNumber);
    public double getBalance();
    public void setBalance(double balance);
}