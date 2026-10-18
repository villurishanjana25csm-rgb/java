import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> items = new LinkedList<>();

        items.add("Shirt");
        items.add("Shoes");
        items.add("Watch");

        System.out.println("Shopping Items: " + items);

        items.addFirst("Bag");
        items.addLast("Cap");

        System.out.println("After adding: " + items);

        items.remove("Shoes");

        System.out.println("After removing: " + items);
    }
}
