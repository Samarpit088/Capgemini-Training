package OOPS_20_01_2026;

import java.util.*;

// Banking System
public class Q4 {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA1", "Sam", 50000));
        accounts.add(new CurrentAccount("CA2", "Sam", 100000));
        for (BankAccount account : accounts) {
            double interest = account.calculateInterest();
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest Earned: " + interest);
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                System.out.println("Loan Eligibility: " +
                        loanAccount.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied for " + amount);
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}
