package OOPS.Level2;
// Program to Simulate an ATM
public class Q2 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Samarpit",1234567,1000000);
        b.deposit(20000);
        b.withdraw(18000);
        b.showBalance();
    }
}
class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount(String accountHolder,long accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    void deposit(double amt) {
        if(amt > 0) balance += amt;
    }

    void withdraw(double amt) {
        if(amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
