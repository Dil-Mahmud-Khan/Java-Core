public class Customer {
    private String phoneNo;
    private Account accounts[];
    public Customer(){}
    public Customer(String phoneNo,int sizeOfArray){
        this.phoneNo=phoneNo;
        this.accounts=new Account[sizeOfArray];
    }

    public void addAccount(Account a){
        int flag=0;
        for(int i=0;i< accounts.length;i++){
            if(accounts[i]==null){
                accounts[i]=a;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Account Added!!");
        }
        else{
            System.out.println("Account couldn't be inserted");
        }
    }
    public void removeAccount(Account a){
        int flag=0;
        for(int i=0;i<accounts.length;i++){
            if(accounts[i]==a){
                accounts[i]=null;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("--Account Removed--");
        }
        else{
            System.out.println("Account Couldn't be Removed");
        }
    }

    public void showAccounts(){
        System.out.println("Showing all Accounts\n");
        System.out.println("Phone Number:"+phoneNo);
        for(int i=0;i<accounts.length;i++){
            if(accounts[i]!=null){
                accounts[i].show();
            }
        }
    }

    public Account getAccbyAccNo(int accountNumber){
        Account a=null;
        for(int i=0;i<accounts.length;i++){
            if(accounts[i]!=null){
                if(accounts[i].getAccountNumber()==accountNumber){
                    a=accounts[i];
                    break;
                }
            }
        }
        return a;
    }

}

