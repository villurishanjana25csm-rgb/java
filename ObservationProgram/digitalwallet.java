// Interface
interface PaymentService {
    void pay(String upiId, double amount);
    void checkBalance();
}


// Custom Exception 1
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}


// Custom Exception 2
class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}


// Custom Exception 3
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}


// Wallet Class
class Wallet {
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor
    Wallet(String userName, String mobileNumber,
           String upiId, double balance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    // Add money
    void addMoney(double amount) {
        balance = balance + amount;
        System.out.println("Money added: Rs." + amount);
    }

    // Get balance
    double getBalance() {
        return balance;
    }

    // Get UPI ID
    String getUpiId() {
        return upiId;
    }

    // Deduct money
    void deductMoney(double amount) {
        balance = balance - amount;
    }

    // Display wallet details
    void displayWalletDetails() {
        System.out.println("\n===== WALLET DETAILS =====");
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.println("Balance       : Rs." + balance);
    }
}


// UPI Payment Class
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Constructor
    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Payment method
    @Override
    public void pay(String upiId, double amount) {

        try {
            // Validate UPI ID
            if (!upiId.contains("@")) {
                throw new InvalidUPIException(
                    "Invalid UPI ID!"
                );
            }

            // Validate amount
            if (amount <= 0) {
                throw new InvalidAmountException(
                    "Amount must be greater than zero!"
                );
            }

            // Check balance
            if (amount > wallet.getBalance()) {
                throw new InsufficientBalanceException(
                    "Insufficient wallet balance!"
                );
            }

            // Deduct amount
            wallet.deductMoney(amount);

            System.out.println("Payment Successful!");
            System.out.println("Paid Rs." + amount);
            System.out.println("To UPI ID: " + upiId);

        } catch (InvalidUPIException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } catch (InvalidAmountException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } finally {
            System.out.println("Transaction process completed.");
        }
    }


    // Check balance
    @Override
    public void checkBalance() {
        System.out.println("Available Balance: Rs."
                           + wallet.getBalance());
    }
}


// Main Class
public class DigitalWallet {
    public static void main(String[] args) {

        // Create wallet
        Wallet wallet = new Wallet(
            "Deekshitha",
            "9876543210",
            "deekshitha@upi",
            5000
        );

        // Create payment service
        UPIPayment payment = new UPIPayment(wallet);


        // Display initial wallet details
        wallet.displayWalletDetails();

        // Add money
        System.out.println("\n===== ADD MONEY =====");
        wallet.addMoney(2000);


        // Check balance
        System.out.println("\n===== BALANCE =====");
        payment.checkBalance();


        // Successful payment
        System.out.println("\n===== PAYMENT 1 =====");
        payment.pay("rahul@upi", 1500);


        // Invalid UPI
        System.out.println("\n===== PAYMENT 2 =====");
        payment.pay("rahulupi", 500);


        // Invalid amount
        System.out.println("\n===== PAYMENT 3 =====");
        payment.pay("rahul@upi", -100);


        // Insufficient balance
        System.out.println("\n===== PAYMENT 4 =====");
        payment.pay("rahul@upi", 10000);


        // Final details
        wallet.displayWalletDetails();

        System.out.println("\n===== FINAL BALANCE =====");
        payment.checkBalance();
    }
}
