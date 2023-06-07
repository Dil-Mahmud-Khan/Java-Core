package Class;

import Interface.ITransaction;

public abstract class Account implements ITransaction {
    protected int accountNumber;
    protected double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void show();

    @Override
    public void deposit(double amount) {
        if(amount>0){
            System.out.println("Previous Balance:"+balance);
            System.out.println("Deposit Balance:"+amount);
            balance+=amount;
            System.out.println("Current Balance:"+balance);
        }
        else{
            System.out.println("Can not Deposit");
        }
    }
    @Override
    public void withdraw(double amount) {
        if(amount>0 && amount<=balance){
            System.out.println("Previous Balance:"+balance);
            System.out.println("Withdraw Balance:"+amount);
            balance-=amount;
            System.out.println("Current Balance:"+balance);
        }
        else{
            System.out.println("Can not Withdraw");
        }
    }
    public void transfer(Account a, double amount) {
        System.out.println("Previous Balance:"+this.balance);
        System.out.println("Transfer Amount:"+amount);
    this.balance=this.balance-amount;
    a.balance=a.balance+amount;
        System.out.println("Current Balance:"+this.balance);
    }
}
