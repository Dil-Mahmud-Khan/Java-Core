public abstract class Account {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Can not deposit");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Can not withdraw");
        }
    }

    public abstract void show();

}
