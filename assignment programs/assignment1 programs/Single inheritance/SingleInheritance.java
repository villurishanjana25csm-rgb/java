package core_java;
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
public void eat() {
        System.out.println(this.name + " is eating food.");
    }
}
class Dog extends Animal {
        private string food;
    public Dog(String name, int age, String food) {
        super(name, age);
        this.food = food;
    }

    public void showDetails() {
        System.out.println(getName() + " is " + getAge() + " years old and eats " + this.food);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog D = new Dog("Buddy", 3, "Chicken");

        D.eat();                 
        D.showDetails(); 
    }
}
