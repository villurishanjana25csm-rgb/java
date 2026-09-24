import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // Creating Iterator
        Iterator<String> iterator = fruits.iterator();

        // hasNext() and next()
        System.out.println("Elements using Iterator:");

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            // remove()
            if (fruit.equals("Banana")) {
                iterator.remove();
            }
        }

        System.out.println("After removing Banana: " + fruits);

        // Creating a new Iterator
        Iterator<String> iterator2 = fruits.iterator();

        // Move to the first element
        if (iterator2.hasNext()) {
            System.out.println("First element: " + iterator2.next());
        }

        // forEachRemaining()
        System.out.println("Remaining elements:");

        iterator2.forEachRemaining(fruit ->
                System.out.println(fruit));
    }
}
