// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Class.*;
public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        s1.setAccountNumber(111);
        s1.setBalance(500);
        s1.setInterestRate(5);

        SavingsAccount s2 = new SavingsAccount();
        s1.setAccountNumber(112);
        s1.setBalance(5000);
        s1.setInterestRate(52);

        SavingsAccount sa3 = new SavingsAccount();
        sa3.setAccountNumber(3111);
        sa3.setBalance(3300);
        sa3.setInterestRate(2.5);

        SavingsAccount sa4 = new SavingsAccount();
        sa4.setAccountNumber(4111);
        sa4.setBalance(4000);
        sa4.setInterestRate(5.5);


        FixedAccount f1 = new FixedAccount();
        f1.setAccountNumber(222);
        f1.setBalance(1000);
        f1.setTenureYear(10);


        FixedAccount f2 = new FixedAccount();
        f2.setAccountNumber(223);
        f2.setBalance(1005);
        f2.setTenureYear(7);

        FixedAccount fa3 = new FixedAccount();
        fa3.setAccountNumber(7111);
        fa3.setBalance(3300);
        fa3.setTenureYear(3);

        FixedAccount fa4 = new FixedAccount();
        fa4.setAccountNumber(8111);
        fa4.setBalance(4000);
        fa4.setTenureYear(7);

        Customer c1 = new Customer();
        c1.setName("Dil");
        c1.setNid(20 - 1);

        c1.insertAccount(s1);
        c1.insertAccount(s2);
        c1.insertAccount(f1);

        Customer c2 = new Customer();
        c1.setName("Mahmud");
        c1.setNid(20 - 2);

        c2.insertAccount(f2);
        c2.insertAccount(fa3);
        c2.insertAccount(sa3);

        Customer c3 = new Customer();
        c3.setName("XYZ");
        c3.setNid(11003344);

        c3.insertAccount(sa4);
        c3.insertAccount(fa4);


        Employee e1 = new Employee();
        e1.setName("Sheikh");
        e1.setEmpId("0001");
        e1.setSalary(45000);

        Employee e2 = new Employee();
        e2.setName("Hasina");
        e2.setEmpId("0002");
        e2.setSalary(65000);


        Bank b1 = new Bank();

        b1.insertCustomer(c1);
        b1.insertCustomer(c2);
        b1.insertCustomer(c3);

        b1.insertEmployee(e1);
        b1.insertEmployee(e2);

        b1.showAllCustomer();
        b1.showAllEmployee();


    }
}