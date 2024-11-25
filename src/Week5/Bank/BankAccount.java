package Week5.Bank;

public class BankAccount {
    private String holder;
    private String iban;
    private double balance;

    public BankAccount(String holder, String iban, double balance) {
        this.holder = holder;
        this.iban = iban;
        this.balance = balance;
    }

    public BankAccount(String holder, String iban) {
        this.holder = holder;
        this.iban = iban;
        this.balance = 0;
    }

    public String getHolder() {
        return holder;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("You can't deposit a negative amount.");
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("You can't withdraw a negative amount.");
            return false;
        }
        if(amount > balance) {
            System.out.println("You can't withdraw more than your balance.");
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "holder='" + holder + '\'' +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
