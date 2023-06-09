public class FixedAccount extends Account{
    private int tenureYear;

    public void setTenureYear(int tenureYear) {
        this.tenureYear = tenureYear;
    }

    public int getTenureYear() {
        return tenureYear;
    }

    @Override
    public void show() {
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Account Holder Name:"+accountHolderName);
        System.out.println("Balance:"+balance);
        System.out.println("Tenure Year:"+tenureYear);
    }
}
