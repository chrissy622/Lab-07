public class TestBank {
    public TestBank(){
    }

    public static void main(String[] args) {
        Bank mybank = new Bank("bigboybank", 12345);

        /*
        Testing object creation methods
         */
        System.out.println("Adding 4 clients : Christina, Bob, Phi, Jill... \nAdding another account to each client...\n");
        int n1 = mybank.openAccount("Christina", "109 Croatan Cir", 450);
        int n2 = mybank.openAccount("Bob", "106 Croatan Cir", 200);
        int n3 = mybank.openAccount("Phi", "1010 Bethwicke Ct", 300);
        int n4 = mybank.openAccount("Jill", "140 Croatan Cir", 340);

        mybank.openAccount(n1, 3000);
        mybank.openAccount(n2, 3000);
        mybank.openAccount(n3, 2340);
        mybank.openAccount(n4, 2405);

        System.out.println("|TESTING PRINT CLIENTS|");
        System.out.println("Printing Clients:...");
        mybank.printClients();

        /*
        Testing delete clients
         */
        System.out.println("|TESTING DELETE CLIENTS|");
        System.out.println("Deleting client \"Christina\" 950123456..." );
        mybank.deleteClient(950123456);
        System.out.println("Deleting client \"Nonexistent\" 123456..." );
        mybank.deleteClient(123456);
        System.out.println();

        System.out.println("Printing Clients:...");
        mybank.printClients();

        /*
        Testing delete accounts
         */
        System.out.println("|TESTING DELETE ACCOUNTS|");
        System.out.println("Deleting account 123457 - Bob \nDeleting account 123456(nonexistent) - Jill");
        mybank.deleteAccount(950123457,123457);
        mybank.deleteAccount(950123459, 123456);
        System.out.println();

        System.out.println("Printing Clients:...");
        mybank.printClients();

        /*
        Testing transfer
         */
        System.out.println("|TESTING TRANSFER|");
        System.out.println("Transferring from account 123458 - Phi to account 123462 ");
        mybank.transfer(123458,123462,299);
        System.out.println("Transferring from account 123459 - Jill to account 123456 - nonexistent ");
        mybank.transfer(123458,1234567, 3456765);

        System.out.println("Printing Clients:...");
        mybank.printClients();



    }
}
