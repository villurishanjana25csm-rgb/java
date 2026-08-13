
import java.util.Scanner;

public class Taskone {

    static int factorial(int n) {
        int fact = 1;
        for(int i=1;i<=n;i++)
            fact *= i;
        return fact;
    }

    static boolean isPrime(int n) {
        if(n<=1)
            return false;

        for(int i=2;i<=(n);i++) {
            if(n%i==0)
                return false;
        }

        return true;
    }

    static int maximum(int a,int b) {
        return (a>b)?a:b;
    }

    static double areaCircle(double r) {
        return 3.14159*r*r;
    }

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.println("===== TASK ONE =====");

        System.out.print("Enter Name : ");
        String name=sc.nextLine();

        System.out.print("Enter Roll Number : ");
        int roll=sc.nextInt();

        System.out.print("Enter Marks in 3 Subjects : ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        int total=m1+m2+m3;
        double percentage=total/3.0;

        System.out.println("\nStudent Details");
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Total : "+total);
        System.out.println("Percentage : "+percentage);

        System.out.print("\nEnter Number : ");
        int num=sc.nextInt();

        if(num%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        System.out.print("\nEnter Three Numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int largest=Math.max(a,Math.max(b,c));
        System.out.println("Largest = "+largest);

        if(percentage>=90)
            System.out.println("Grade A");
        else if(percentage>=75)
            System.out.println("Grade B");
        else if(percentage>=60)
            System.out.println("Grade C");
        else
            System.out.println("Grade D");

        System.out.print("\nEnter Day Number (1-7): ");
        int day=sc.nextInt();

        switch(day) {
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
            case 7:System.out.println("Sunday");break;
            default:System.out.println("Invalid Day");
        }

        System.out.print("\nEnter Table Number : ");
        int table=sc.nextInt();

        for(int i=1;i<=10;i++)
            System.out.println(table+" x "+i+" = "+table*i);

        System.out.print("\nEnter N : ");
        int n=sc.nextInt();

        int sum=0;

        System.out.println("Numbers from 1 to N");

        for(int i=1;i<=n;i++) {
            System.out.print(i+" ");
            sum+=i;
        }

        System.out.println("\nSum = "+sum);

        int first=0,second=1;

        System.out.println("Fibonacci Series");

        for(int i=1;i<=n;i++) {
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }

        System.out.print("\n\nEnter Number for Factorial : ");
        int f=sc.nextInt();
        System.out.println("Factorial = "+factorial(f));

        System.out.print("Enter Number for Prime Check : ");
        int p=sc.nextInt();
        System.out.println(isPrime(p));

        System.out.print("Enter Two Numbers : ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Maximum = "+maximum(x,y));

        System.out.print("Enter Radius : ");
        double r=sc.nextDouble();

        System.out.println("Area = "+areaCircle(r));

        sc.close();
    }
}
