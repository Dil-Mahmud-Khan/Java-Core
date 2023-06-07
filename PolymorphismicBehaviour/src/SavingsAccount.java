public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(){}
    public SavingsAccount(int accountNumber,String accountHolderName,double balance,double interestRate){
        super(accountNumber,accountHolderName,balance);
        this.interestRate=interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void show(){
        super.show();
        System.out.println("Interest Rate:"+interestRate);

    }
}