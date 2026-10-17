package core_java;
import java.util.Scanner;
// Interface defines the common salary calculation method
interface Employee {
    void calculateSalary();
}

class RegularEmployee implements Employee {
    int basicPay = 25000;
    int hra = 15000;
    int ta = 5000;

    // Calculates and displays regular employee salary
    public void calculateSalary() {
        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class ContractEmployee implements Employee {
    int basicPay = 12000;
    int ta = 3000;
// Calculates and displays contract employee salary
    public void calculateSalary() {
        int total = basicPay + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: 0");
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Type (Regular/Contract): ");
        String type = sc.nextLine();

        Employee emp;
// Creates RegularEmployee object based on user input
        if (type.equalsIgnoreCase("Regular")) {
            emp = new RegularEmployee();
            emp.calculateSalary();
        }
        else if (type.equalsIgnoreCase("Contract")) {
            emp = new ContractEmployee();
            emp.calculateSalary();
        }
        else {
            System.out.println("Invalid Employee Type");
        }

        sc.close();
    }
}
