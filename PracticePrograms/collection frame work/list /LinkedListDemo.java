import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> food = new LinkedList<>();

        food.add("Biryani");
        food.add("Chicken");
        food.add("Ice Cream");

        System.out.println("Food List: " + food);

        food.addFirst("Starter");
        food.addLast("Chocolate");

        System.out.println("After adding: " + food);

        food.remove("Chicken");

        System.out.println("After removing: " + food);
    }
}
