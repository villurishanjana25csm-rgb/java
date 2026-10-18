import java.io.*;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

    // Constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void display() {
        System.out.println(rollNo + "\t" + name + "\t" + marks);
    }
}

public class StudentRecord {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Accept student details
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        FileWriter fw = new FileWriter("students.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();

            students[i] = new Student(roll, name, marks);

            // Write records to file
            bw.write(roll + "," + name + "," + marks);
            bw.newLine();
        }

        bw.close();

        // Read and display records
        System.out.println("\nStudent Records:");
        System.out.println("Roll No\tName\tMarks");

        BufferedReader br = new BufferedReader(
            new FileReader("students.txt")
        );

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            System.out.println(data[0] + "\t" +
                               data[1] + "\t" + data[2]);
        }
        br.close();

        // Display students above specified marks
        System.out.print("\nEnter minimum marks: ");
        double limit = sc.nextDouble();

        System.out.println("\nStudents scoring above " + limit + ":");
        System.out.println("Roll No\tName\tMarks");

        for (Student s : students) {
            if (s.marks > limit) {
                s.display();
            }
        }

        sc.close();
    }
}
