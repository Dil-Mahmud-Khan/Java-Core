// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Customer c = new Customer("01632913925", 10);

        Account a1 = new Account(1111, "Dil", 500);

        SavingsAccount s1 = new SavingsAccount();
        s1.setAccountNumber(2222);
        s1.setAccountHolderName("Mahmud");
        s1.setBalance(2000);
        s1.setInterestRate(5);

        SavingsAccount s2 = new SavingsAccount(1112, "Messi", 5000, 7);

        FixedAccount f1 = new FixedAccount(3333, "Khan", 3000, 5);

        c.addAccount(a1);
        c.addAccount(s1);
        c.addAccount(f1);
        c.addAccount(s2);


//        c.removeAccount(f1);
//        c.showAccounts();
        c.removeAccount(s2);

        if(c.getAccbyAccNo(1111) != null){
            System.out.println("FOUND");
            //find tenure year of account 3333
            System.out.println("The Owner is: "+c.getAccbyAccNo(2222).getAccountHolderName());

        }
    }
}
