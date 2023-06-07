public class Customer implements IAccountOperations{
    Account accounts[];
    public Customer(){}
    public Customer(int sizeOfArray){
        accounts=new Account[sizeOfArray];
    }
    @Override
    public void addAccount(Account a) {
        int flag=0;
        for(int i=0;i<accounts.length;i++){
            if(accounts[i]==null){
                accounts[i]=a;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Account Inserted");
        }
        else{
            System.out.println("Account can not be Inserted");
        }

    }

    @Override
    public void removeAccount(Account a) {
        int flag=0;
        for(int i=0;i< accounts.length;i++){
            if(accounts[i]==a){
                accounts[i]=null;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Account Removed");
        }
        else{
            System.out.println("Account can not be Removed");
        }
    }

    @Override
    public void showAllAccounts() {
        for(int i=0;i< accounts.length;i++){
            if(accounts[i]!=null){
                System.out.println("--------");
                accounts[i].show();
                System.out.println();
            }
        }
    }
}
