//http://people.uncw.edu/simmondsd/courses/Current/csc331/
public interface IClient {
        /**
         * Opens a new account for the client and assign
         * the account an account number. The account
         * constructor requires only balance as an actual parameter.
         * @param balance
         * @return the client number
         */


        public int openAccount(double balance);

        /**
         * Searches the client's list of accounts for the
         * account that matches 'accountFrom' and 'accountTo'
         * and transfers 'balance' from the first account to
         * the second account.
         * @param accountFrom
         * @param accountTo
         * @param amount
         * @return
         */
        public boolean transfer(int accountFrom, int accountTo, double amount);

        /**
         * Searches for and returns a reference to the account
         * that matches 'accountNumber'
         * @param accountNumber
         * @return
         */
        public Account getAccount(int accountNumber);

        public void printAccounts();

        int getClientNumber();

        void deleteAccount(int accountNumber);//Deletes this clients account
    }