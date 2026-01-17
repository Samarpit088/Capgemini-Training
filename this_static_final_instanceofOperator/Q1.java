package this_static_final_instanceofOperator;
// Bank Account System
public class Q1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Sam", 101);
        b1.display(b1);
        BankAccount.getTotalAccounts();
    }
}
class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;
    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display(Object obj) {
        if (obj instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Account No: " + accountNumber);
        }
    }
}