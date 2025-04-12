package bank;

public class Account {
    private String holder;
    private double balance;

    public Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public String getDetails() {
        return "Holder: " + holder + ", Balance: " + balance;
    }
}
import bank.Account;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("John Doe", 1000.0);
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println(acc.getDetails());
    }
}
