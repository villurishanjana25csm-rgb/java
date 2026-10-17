package core_java;
class Customer {
    String name;
    String location;

    Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void senderOrder() {
        System.out.println(name + " is sending an order.");
    }

    void receiverOrder() {
        System.out.println(name + " is receiving an order.");
    }
}

class Order {
    String date;
    String number;

    Order(String date, String number) {
        this.date = date;
        this.number = number;
    }

    void confirm() {
        System.out.println("Order " + number + " is confirmed.");
    }

    void close() {
        System.out.println("Order " + number + " is closed.");
    }
}

class SpecialOrder extends Order {

    SpecialOrder(String date, String number) {
        super(date, number);
    }

    void dispatch() {
        System.out.println("Special order " + number + " is dispatched.");
    }
}

class NormalOrder extends Order {

    NormalOrder(String date, String number) {
        super(date, number);
    }

    void dispatch() {
        System.out.println("Normal order " + number + " is dispatched.");
    }

    void receive() {
        System.out.println("Normal order " + number + " is received.");
    }
}

public class OrderDemo {

    public static void main(String[] args) {

        Customer customer =
            new Customer("Meghana", "Srikakulam");

        SpecialOrder specialOrder =
            new SpecialOrder("11-08-2026", "S101");

        NormalOrder normalOrder =
            new NormalOrder("11-08-2026", "N101");

        System.out.println("Customer Details");
        System.out.println("Name     : " + customer.name);
        System.out.println("Location : " + customer.location);

        System.out.println("\nSpecial Order");
        specialOrder.confirm();
        specialOrder.dispatch();
        specialOrder.close();

        System.out.println("\nNormal Order");
        normalOrder.confirm();
        normalOrder.dispatch();
        normalOrder.receive();
        normalOrder.close();

        System.out.println();
        customer.senderOrder();
        customer.receiverOrder();
    }
}
