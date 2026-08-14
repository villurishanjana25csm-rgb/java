interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Parrot implements Animal, Bird {

    public void eat() {
        System.out.println("Parrot eats food");
    }

    public void fly() {
        System.out.println("Parrot can fly");
    }
}

public class Interface {
    public static void main(String[] args) {

        Parrot p = new Parrot();

        p.eat();
        p.fly();
    }
}
