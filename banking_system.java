
class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(int a, String n, double b) {
        accountNumber = a;
        accountHolderName = n;
        balance = b;
    }

    // Deposit
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw
    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Check Balance
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    // Display Details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, "Rahul", 5000);
        BankAccount b2 = new BankAccount(102, "Aman", 10000);

        b1.deposit(2000);
        b1.withdraw(1000);
        b1.checkBalance();

        System.out.println();

        b2.deposit(3000);
        b2.withdraw(2000);
        b2.checkBalance();

        System.out.println();

        b1.displayDetails();

        System.out.println();

        b2.displayDetails();
    }
}
