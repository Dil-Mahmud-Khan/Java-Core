public class FixedAccount extends Account{
    private int tenureYear;
    public FixedAccount(){}
    public FixedAccount(int accountNumber,String accountHolderName,double balance, int tenureYear){
        super(accountNumber,accountHolderName,balance);
        this.tenureYear=tenureYear;
    }

    public void setTenureYear(int tenureYear) {
        this.tenureYear = tenureYear;
    }

    public int getTenureYear() {
        return tenureYear;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Tenure Year:"+tenureYear);

    }
}
