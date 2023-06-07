// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer c=new Customer(5);

        SavingsAccount s1=new SavingsAccount();
        s1.setAccountNumber(111);
        s1.setAccountHolderName("Dil");
        s1.setBalance(100);
        s1.setInterestRate(5);

        SavingsAccount s2=new SavingsAccount();
        s2.setAccountNumber(113);
        s2.setAccountHolderName("Khan");
        s2.setBalance(1002);
        s2.setInterestRate(51);

        FixedAccount f1=new FixedAccount();
        f1.setAccountNumber(112);
        f1.setAccountHolderName("Mahmud");
        f1.setBalance(200);
        f1.setTenureYear(10);

        c.addAccount(s1);
        c.addAccount(s2);
        c.addAccount(f1);

        c.removeAccount(s2);

        c.showAllAccounts();
    }
}