package core_java;

// 1. PaymentService Interface
interface PaymentService {

    void pay(String receiverUPI, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException;

    void checkBalance();
}


// 2. Custom Exception - Insufficient Balance
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}


// 3. Custom Exception - Invalid UPI
class InvalidUPIException extends Exception {

    InvalidUPIException(String message) {
        super(message);
    }
}


// 4. Custom Exception - Invalid Amount
class InvalidAmountException extends Exception {

    InvalidAmountException(String message) {
        super(message);
    }
}


// 5. Wallet Class
class Wallet {

    // Private data members for encapsulation
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor
    Wallet(String userName, String mobileNumber, String upiId) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = 0.0;
    }

    // Method to add money
    void addMoney(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero."
            );
        }

        balance = balance + amount;

        System.out.println("Money added successfully: Rs." + amount);
    }

    // Method to get balance
    double getBalance() {
        return balance;
    }

    // Method to deduct money
    void deductMoney(double amount) {
        balance = balance - amount;
    }

    // Method to display wallet details
    void displayWalletDetails() {

        System.out.println("\n----- Final Wallet Details -----");
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.println("Balance       : Rs." + balance);
    }
}


// 6. UPIPayment Class
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Constructor
    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Implementing pay() method
    public void pay(String receiverUPI, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        // Validate UPI ID
        if (receiverUPI == null ||
            !receiverUPI.contains("@") ||
            receiverUPI.startsWith("@") ||
            receiverUPI.endsWith("@")) {

            throw new InvalidUPIException(
                    "Invalid UPI ID: " + receiverUPI
            );
        }

        // Validate payment amount
        if (amount <= 0) {

            throw new InvalidAmountException(
                    "Payment amount must be greater than zero."
            );
        }

        // Check sufficient balance
        if (amount > wallet.getBalance()) {

            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance: Rs."
                    + wallet.getBalance()
            );
        }

        // Deduct amount from wallet
        wallet.deductMoney(amount);

        // Payment successful
        System.out.println("\n----- Payment Details -----");
        System.out.println("Payment Successful!");
        System.out.println("Receiver UPI : " + receiverUPI);
        System.out.println("Amount Paid  : Rs." + amount);
    }

    // Implementing checkBalance() method
    public void checkBalance() {

        System.out.println(
                "Available Balance: Rs." + wallet.getBalance()
        );
    }
}


// 7. Main Class
public class DigitalPaymentSystem {

    public static void main(String[] args) {

        // Create a wallet
        Wallet wallet = new Wallet(
                "Ananya",
                "9876543210",
                "ananya@upi"
        );

        // Associate Wallet with UPIPayment object
        PaymentService payment = new UPIPayment(wallet);

        try {

            // Add money to wallet
            wallet.addMoney(5000);

            // Check available balance
            payment.checkBalance();

            // Make UPI payment
            payment.pay("kiran@upi", 1500);

        }
        catch (InvalidUPIException e) {

            System.out.println(
                    "Transaction Failed: " + e.getMessage()
            );
        }
        catch (InvalidAmountException e) {

            System.out.println(
                    "Transaction Failed: " + e.getMessage()
            );
        }
        catch (InsufficientBalanceException e) {

            System.out.println(
                    "Transaction Failed: " + e.getMessage()
            );
        }
        finally {

            System.out.println(
                    "\nTransaction processing completed."
            );
        }

        // Display final wallet details
        wallet.displayWalletDetails();
    }
}
