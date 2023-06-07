// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.ShowDetails();

        Account acc1=new Account(111,"dil");
        acc1.ShowDetails();

        Account acc2=new Account(111,"Mahmud",500);
        acc2.ShowDetails();

        FixedAccount f1=new FixedAccount();
        f1.ShowDetails();

        FixedAccount f2=new FixedAccount(450,"Kaka",1000,5);
        f2.ShowDetails();
    }
}