import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<String> tickets = new ArrayDeque<>();

        tickets.add("Ticket A");
        tickets.add("Ticket B");
        tickets.add("Ticket C");

        System.out.println("Tickets: " + tickets);

        tickets.addFirst("VIP Ticket");

        System.out.println("After adding VIP: " + tickets);

        tickets.removeLast();

        System.out.println("After removing last: " + tickets);
    }
}
