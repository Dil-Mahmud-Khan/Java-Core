package Interface;
import Class.Account;
public interface AccountOperations {
    void insertAccount(Account a);
    void removeAccount(Account a);
    Account getAccount(int accountNumber);
    void showAllAccount();
}
