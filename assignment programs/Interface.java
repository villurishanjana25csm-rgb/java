interface I1 {
    void display();
}

interface I2 extends I1 {
    void show();
}

class Demo implements I2 {

    public void display() {
        System.out.println("Display method");
    }

    public void show() {
        System.out.println("Show method");
    }
}

public class Interface {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.display();
        d.show();
    }
}
