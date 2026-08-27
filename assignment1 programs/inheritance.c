interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("A method");
    }

    public void showB() {
        System.out.println("B method");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}