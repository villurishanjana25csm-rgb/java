class Employee {

    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Constructor 1
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.designation = "Not Assigned";
        this.salary = 0;
        this.promotionStatus = "Not Decided";
    }

    // Constructor 2
    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = "Not Decided";
    }

    // Constructor 3
    Employee(String name, int id, String designation,
             double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name             : " + name);
        System.out.println("ID               : " + id);
        System.out.println("Designation      : " + designation);
        System.out.println("Salary           : " + salary);
        System.out.println("Promotion Status : " + promotionStatus);
        System.out.println();
    }
}

class EmployeeDetails {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ravi", 101);

        Employee e2 = new Employee(
            "Priya", 102, "Manager", 50000
        );

        Employee e3 = new Employee(
            "Anil", 103, "Senior Manager", 70000, "Promoted"
        );

        e1.display();
        e2.display();
        e3.display();
    }
}