package core_java;
import java.util.Scanner;

class RBI {
    double getRateOfInterest() {
        return 4.0;
    }
}

class SBI extends RBI {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

class ICICI extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

class PNB extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.0;
    }
}

public class BankInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Bank name to find the rate of Interest:");
        String bank = sc.nextLine();

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
            System.out.println("Invalid Bank Name");
            sc.close();
            return;
        }

        System.out.println("RBI rate of interest is : "
                           + rbi.getRateOfInterest() + "%");

        sc.close();
    }
}
