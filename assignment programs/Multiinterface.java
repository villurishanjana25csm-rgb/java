interface I1 {
    void show();
}

interface I2 {
    void display();
}

interface I3 {
    void print();
}

class C2 {
    void message() {
        System.out.println("C2 method");
    }
}

class C1 extends C2 implements I1, I2, I3 {

    public void show() {
        System.out.println("I1 method");
    }

    public void display() {
        System.out.println("I2 method");
    }

    public void print() {
        System.out.println("I3 method");
    }
}

public class Multiinterface {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.message();
        obj.show();
        obj.display();
        obj.print();
    }
}
