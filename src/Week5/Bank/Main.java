package Week5.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", "NL01INHO0000000001", 1000);
        BankAccount account2 = new BankAccount("Jane Doe", "NL01INHO0000000002");
        System.out.println(account1);
        account1.deposit(-2000);
        account1.deposit(3000);
        System.out.println(account1);
        if(account1.withdraw(2000)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
        account1.withdraw(-5000);
        System.out.println(account1);
        if (account1.withdraw(3000)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
        BankAccount djordin = new BankAccount("Djordin Deleu", "BE45 8477 0157 5478", 35652);
        System.out.println("\n" + djordin);
        djordin.deposit(6487);
        System.out.println("Saldo van " + djordin.getHolder() + " = " + djordin.getBalance());
    }

}
