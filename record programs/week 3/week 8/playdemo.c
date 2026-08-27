import java.util.Scanner;

class Employee {
    String empId;

    Employee(String empId) {
        this.empId = empId;
    }

    void salaryDetails() {
        System.out.println("Employee Salary Details");
    }
}

class RegularEmployee extends Employee {

    RegularEmployee(String empId) {
        super(empId);
    }

    void salaryDetails() {
        int basic = 25000;
        int hra = 15000;
        int ta = 5000;
        int total = basic + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class ContractEmployee extends Employee {

    ContractEmployee(String empId) {
        super(empId);
    }

    void salaryDetails() {
        int basic = 12000;
        int hra = 0;
        int ta = 3000;
        int total = basic + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class Paydemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine();

        Employee emp;

        // R = Regular Employee
        // C = Contract Employee
        if (id.charAt(0) == 'R' || id.charAt(0) == 'r') {
            emp = new RegularEmployee(id);
        }
        else if (id.charAt(0) == 'C' || id.charAt(0) == 'c') {
            emp = new ContractEmployee(id);
        }
        else {
            System.out.println("Invalid Employee Id");
            return;
        }

        emp.salaryDetails();

        sc.close();
    }
}