package ClassesAndObjects;

public class BankAccountUser {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("William Wallace", 123456);
        String accountName = bankAccount.getAccountName();
        int accountNumber = bankAccount.getAccountNumber();

        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
    }
}
