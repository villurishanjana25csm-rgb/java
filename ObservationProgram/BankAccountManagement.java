class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    // Constructor
    Account(int accountNumber, String accountHolderName,
            double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit 
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: Rs." + amount);
    }

    // Withdraw 
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Transfer 
    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println("Transferred: Rs." + amount);
            System.out.println("To Account: " + receiver.accountNumber);
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }

    // Display account 
    void displayAccountDetails() {
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Account Type     : " + accountType);
        System.out.println("Balance          : Rs." + balance);
    }
}


// Savings Account inherits Account
class SavingsAccount extends Account {
    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, String accountHolderName,
                   double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Calculate interest
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;

        System.out.println("Interest Rate    : " + interestRate + "%");
        System.out.println("Interest Earned  : Rs." + interest);
    }
}


// Current Account inherits Account
class CurrentAccount extends Account {
    double overdraftLimit;

    // Constructor
    CurrentAccount(int accountNumber, String accountHolderName,
                   double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }

    // Display overdraft 
    void displayOverdraft() {
        System.out.println("Overdraft Limit  : Rs." + overdraftLimit);
    }
}


// Main class
public class BankAccountManagement {
    public static void main(String[] args) {

        SavingsAccount savings =
            new SavingsAccount(101, "Deekshitha", 10000, 5);
      
        CurrentAccount current =
            new CurrentAccount(102, "Rahul", 5000, 3000);

        
        System.out.println("===== BEFORE TRANSACTIONS =====");

        System.out.println("\nSavings Account");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account");
        current.displayAccountDetails();
        current.displayOverdraft();


        // Deposit
        System.out.println("\n===== DEPOSIT =====");
        savings.deposit(2000);
        current.deposit(3000);


        // Withdrawal
        System.out.println("\n===== WITHDRAWAL =====");
        savings.withdraw(1500);
        current.withdraw(9000);


        // Calculate interest
        System.out.println("\n===== INTEREST CALCULATION =====");
        savings.calculateInterest();


        // Transfer money
        System.out.println("\n===== FUND TRANSFER =====");
        savings.transfer(current, 2000);


        // Display details after transactions
        System.out.println("\n===== AFTER TRANSACTIONS =====");

        System.out.println("\nSavings Account");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account");
        current.displayAccountDetails();
        current.displayOverdraft();


        // Final balances
        System.out.println("\n===== FINAL BALANCES =====");
        System.out.println("Savings Account Balance : Rs." + savings.balance);
        System.out.println("Current Account Balance : Rs." + current.balance);
    }
}
