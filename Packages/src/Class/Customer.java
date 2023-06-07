package Class;
import java.lang.*;
import Interface.AccountOperations;

public class Customer implements AccountOperations {
    private String name;
    private int nid;
    private final Account[] account =new Account[10];

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public int getNid() {
        return nid;
    }
    public void insertAccount(Account a){
        int flag=0;
        for(int i=0;i<account.length;i++){
            if(account[i]==null){
                account[i]=a;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Account Inserted");
        }
        else{
            System.out.println("Account can not Insert");
        }
    }

    public void removeAccount(Account a){
        int flag=0;
        for(int i=0;i< account.length;i++){
            if(account[i]==a){
                account[i]=null;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Account Removed");
        }
        else{
            System.out.println("Account did not removed");
        }
    }

    public Account getAccount(int accountNumber){
        Account a=null;
        for(int i=0;i< account.length;i++){
            if(account[i]!=null){
                if(account[i].getAccountNumber()==accountNumber){
                    a=account[i];
                    break;
                }
            }
        }
        return a;
    }

    @Override
    public void showAllAccount() {
        for(Account a : account)
        {
            if(a != null)
            {
                a.show();
            }
        }
    }
}
