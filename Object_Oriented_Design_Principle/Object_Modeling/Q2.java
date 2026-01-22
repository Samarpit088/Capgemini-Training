package Object_Oriented_Design_Principle.Object_Modeling;
// Bank and Account Holders (Association)
public class Q2 {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");
        Customer c1 = new Customer("Sam");
        Customer c2 = new Customer("Samar");
        bank.openAccount(c1, 5000);
        bank.openAccount(c2, 10000);
        c1.viewBalance(bank);
        c2.viewBalance(bank);
    }
}
class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, double initialBalance) {
        customer.balance = initialBalance;
        System.out.println("Account opened for " + customer.name + " in " + bankName + " with balance " + initialBalance);
    }
}
class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance(Bank bank) {
        System.out.println(name + "'s balance in " + bank.bankName + " is " + balance);
    }
}

