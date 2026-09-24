import java.util.Scanner;

class Student {
    int roll;
    String name;
    int[] marks = new int[5];

    Student(int r, String n, int[] m) {
        roll = r;
        name = n;
        marks = m;
    }

    void display() {
        int total = 0, high = marks[0], low = marks[0];

        for (int i = 0; i < 5; i++) {
            total += marks[i];

            if (marks[i] > high)
                high = marks[i];

            if (marks[i] < low)
                low = marks[i];
        }

        double percentage = Math.round((total / 5.0) * 100) / 100.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\nStudent Name: " + name.trim().toUpperCase());
        System.out.println("Roll Number: " + roll);
        System.out.println("Total: " + total);
        System.out.println("Average: " + total / 5.0);
        System.out.println("Highest: " + high);
        System.out.println("Lowest: " + low);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (percentage >= 50 ? "PASS" : "FAIL"));
    }
}

public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter 5 marks:");

        for (int i = 0; i < 5; i++)
            marks[i] = sc.nextInt();

        Student s = new Student(roll, name, marks);
        s.display();

        sc.close();
    }
}
