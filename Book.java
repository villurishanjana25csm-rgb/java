

class Book {

    // Encapsulation
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // Default Constructor
    Book() {
        bookId = 0;
        bookName = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    // Getter Methods
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setter Methods
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void displayBook() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

// Inheritance
class Person {
    String name = "Rahul";
}

class Student extends Person {
    int rollNo = 101;

    void displayStudent() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number : " + rollNo);
    }
}

class Faculty extends Person {
    String department = "Computer Science";

    void displayFaculty() {
        System.out.println("Faculty Name : " + name);
        System.out.println("Department : " + department);
    }
}

// Method Overloading
class Area {

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    int calculateArea(int length, int breadth) {
        return length * breadth;
    }
}

// Method Overriding
class Vehicle {

    void display() {
        System.out.println("This is a Vehicle.");
    }
}

class Car extends Vehicle {

    @Override
    void display() {
        System.out.println("This is a Car.");
    }
}

class Bike extends Vehicle {

    @Override
    void display() {
        System.out.println("This is a Bike.");
    }
}

// Abstraction
abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Interface
interface Printable {

    void print();
}

class Report implements Printable {

    @Override
    public void print() {
        System.out.println("Printing Library Report...");
    }
}

// Main Class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Book Object
        Book book = new Book(101, "Java Programming", "James Gosling", 550);

        System.out.println("===== BOOK DETAILS =====");
        book.displayBook();

        // Student Object
        System.out.println("\n===== STUDENT DETAILS =====");
        Student s = new Student();
        s.displayStudent();

        // Faculty Object
        System.out.println("\n===== FACULTY DETAILS =====");
        Faculty f = new Faculty();
        f.displayFaculty();

        // Method Overloading
        Area area = new Area();

        System.out.println("\nCircle Area = " + area.calculateArea(5.0));
        System.out.println("Rectangle Area = " + area.calculateArea(6,4));

        // Method Overriding
        Vehicle v;

        System.out.println("\n===== VEHICLE DETAILS =====");

        v = new Car();
        v.display();

        v = new Bike();
        v.display();

        // Abstraction
        Shape c = new Circle();
        Shape r = new Rectangle();

        System.out.println("\n===== SHAPES =====");

        c.draw();
        r.draw();

        // Interface
        System.out.println("\n===== REPORT =====");

        Report rep = new Report();
        rep.print();
    }
}
