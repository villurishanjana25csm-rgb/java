package core_java;
import java.util.Scanner;

public class StudentUtility {

    // Factorial Method
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    // Prime Method
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Maximum Method
    static int maximum(int a, int b) {
        if(a>b){
          return a;
        }else{
          return b;
    }
    }
    // Area of Circle Method
    static double areaCircle(double r) {
       A= 3.14*r*r;
      return A;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Part A: Student Details
        System.out.println(" STUDENT INFORMATION \n");

        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        int total = 0;

        System.out.println("Enter Marks of 5 Subjects:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            total = total+sc.nextInt();
        }

        double percentage = total / 5.0;

        System.out.println("\nStudent Name : " + name);
        System.out.println("Roll Number  : " + roll);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage);

        // Grade
        if (percentage >= 90)
            System.out.println("Grade : A+");
        else if (percentage >= 80)
            System.out.println("Grade : A");
        else if (percentage >= 70)
            System.out.println("Grade : B");
        else if (percentage >= 60)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");

        int choice;

        do {

            System.out.println("1. Even or Odd");
            System.out.println("2. Largest of Three Numbers");
            System.out.println("3. Day of Week");
            System.out.println("4. Multiplication Table");
            System.out.println("5. Numbers from 1 to N");
            System.out.println("6. Sum of First N Natural Numbers");
            System.out.println("7. Fibonacci Series");
            System.out.println("8. Methods");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();

                    if (num % 2 == 0)
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");
                    break;

                case 2:
                    System.out.print("Enter Three Numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();

                    if(a>b&&a>c)
                        System.out.println("Largest Number = " + a);
                    else if(b>a&&b>c)
                        System.out.println("Largest Number = " + b);
                    else
                        System.out.println("Largest Number = " + c);
                    break;

                case 3:
                    System.out.print("Enter Day Number (1-7): ");
                    int day = sc.nextInt();

                    switch (day) {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;
                        default:
                            System.out.println("Invalid Day");
                    }
                    break;

                case 4:
                    System.out.print("Enter Number: ");
                    int table = sc.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(table + " x " + i + " = " + (table * i));
                    }
                    break;

                case 5:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                    break;

                case 6:
                    System.out.print("Enter N: ");
                    int num1 = sc.nextInt();

                    int sum = 0;

                    for (int i = 1; i <= num1; i++) {
                        sum = sum + i;
                    }

                    System.out.println("Sum = " + sum);
                    break;

                case 7:
                    System.out.print("Enter Number of Terms: ");
                    int terms = sc.nextInt();

                    int x = 0, y = 1;

                    System.out.print("Fibonacci Series: ");

                    for (int i = 1; i <= terms; i++) {
                        System.out.print(x + " ");
                        int next = x + y;
                        x = y;
                        y = next;
                    }
                    break;

                case 8:

                    System.out.print("Enter Number for Factorial: ");
                    int f = sc.nextInt();
                    System.out.println("Factorial = " + factorial(f));

                    System.out.print("Enter Number to Check Prime: ");
                    int p = sc.nextInt();

                    if (isPrime(p))
                        System.out.println("Prime Number");
                    else
                        System.out.println("Not Prime");

                    System.out.print("Enter Two Numbers: ");
                    int m1 = sc.nextInt();
                    int m2 = sc.nextInt();

                    System.out.println("Maximum = " + maximum(m1, m2));

                    System.out.print("Enter Radius: ");
                    double r = sc.nextDouble();

                    System.out.println("Area = " + areaCircle(r));

                    break;

                case 9:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while (choice != 9);

        sc.close();
    }
     }
