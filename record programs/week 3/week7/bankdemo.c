import java.util.Scanner;

// Customer class
class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Account class
class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// RBI - Base class
class RBI {
    
    double getRateOfInterest() {
        return 4.0;
    }
}

// SBI - Derived class
class SBI extends RBI {

    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

// ICICI - Derived class
class ICICI extends RBI {

    @Override
    double getRateOfInterest() {
        return 6.0;
    }
}

// PNB - Derived class
class PNB extends RBI {

    @Override
    double getRateOfInterest() {
        return 5.0;
    }
}

// Main class
class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of Interest : ");
        String bank = sc.nextLine();

        // Dynamic polymorphism
        RBI rbi;

        if (bank.equalsIgnoreCase("RBI")) {
            rbi = new RBI();
        }
        else if (bank.equalsIgnoreCase("SBI")) {
            rbi = new SBI();
        }
        else if (bank.equalsIgnoreCase("ICICI")) {
            rbi = new ICICI();
        }
        else if (bank.equalsIgnoreCase("PNB")) {
            rbi = new PNB();
        }
        else {
            System.out.println("Bank not available");
            return;
        }

        System.out.println("RBI rate of interest is : "
                           + rbi.getRateOfInterest() + "%");

        sc.close();
    }
}