
class A {
    int x = 5;

    void add() {
        System.out.println("Add from first is: " + (x + 5));
    }
}

// Multilevel Inheritance
class B extends A {
    int y = 10;

    void sub() {
        System.out.println("Sub from second is: " + (y - 10));
    }
}

class C extends B {
    int z = 5;

    void mul() {
        System.out.println("Mul from third is: " + (z * 5));
    }
}

public class Communication {
    public static void main(String[] args) {
        C obj1 = new C();

        System.out.println("Variable: " + obj1.x);
        obj1.add();
        obj1.sub();
        obj1.mul();
    }
}
    

