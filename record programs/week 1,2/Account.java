import java.util.Scanner;

class Account {
    int accountNumber;
    double balance;
    String accountType;

    Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }

    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Amount transferred successfully.");
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}


// Savings Account
class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, double balance,
                   String accountType, double interestRate) {

        super(accountNumber, balance, accountType);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;

        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("Interest Added: " + interest);
    }
}


// Current Account
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNumber, double balance,
                   String accountType, double overdraftLimit) {

        super(accountNumber, balance, accountType);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}


// Main Class
public class BankAccountManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating Savings Account
        SavingsAccount savings =
            new SavingsAccount(101, 10000, "Savings", 5);

        // Creating Current Account
        CurrentAccount current =
            new CurrentAccount(102, 5000, "Current", 3000);


        System.out.println("===== SAVINGS ACCOUNT =====");

        savings.displayAccount();

        System.out.println("\nDepositing Rs.2000");
        savings.deposit(2000);

        System.out.println("\nWithdrawing Rs.1500");
        savings.withdraw(1500);

        System.out.println("\nCalculating Interest");
        savings.calculateInterest();

        System.out.println("\nUpdated Savings Account:");
        savings.displayAccount();


        System.out.println("\n===== CURRENT ACCOUNT =====");

        current.displayAccount();

        System.out.println("\nDepositing Rs.3000");
        current.deposit(3000);

        System.out.println("\nWithdrawing Rs.9000");
        current.withdraw(9000);

        System.out.println("\nUpdated Current Account:");
        current.displayAccount();


        System.out.println("\n===== TRANSFER =====");

        System.out.println("Transferring Rs.1000 from Savings to Current");

        savings.transfer(current, 1000);

        System.out.println("\nSavings Account after transfer:");
        savings.displayAccount();

        System.out.println("\nCurrent Account after transfer:");
        current.displayAccount();

        sc.close();
    }
}
