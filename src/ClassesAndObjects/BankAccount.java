package ClassesAndObjects;

public class BankAccount {

    // class attributes
    private String accountName;
    private int accountNumber;

    // constructor
    BankAccount(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
