package core_java;
class Employee {

    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Default Constructor
    Employee() {
        name = "Not Assigned";
        id = 0;
        designation = "Trainee";
        salary = 0;
        promotionStatus = "No";
    }

    // Constructor with two parameters
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Developer";
        salary = 30000;
        promotionStatus = "No";
    }

    // Constructor with all parameters
    Employee(String name, int id,
             String designation,
             double salary,
             String promotionStatus) {

        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
        System.out.println("Promotion Status : " + promotionStatus);
        System.out.println();
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee(
                "Meghana", 101);

        Employee e3 = new Employee(
                "Ravi", 102,
                "Manager", 60000,
                "Yes");

        System.out.println("Employee 1");
        e1.display();

        System.out.println("Employee 2");
        e2.display();

        System.out.println("Employee 3");
        e3.display();
    }
}
