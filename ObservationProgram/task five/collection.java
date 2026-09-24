import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
    public static void main(String[] args) {

        Collection<String> fruits = new ArrayList<>();

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Collection: " + fruits);

        // addAll()
        Collection<String> moreFruits =
                Arrays.asList("Orange", "Grapes");

        fruits.addAll(moreFruits);
        System.out.println("After addAll(): " + fruits);

        // remove()
        fruits.remove("Banana");
        System.out.println("After remove(): " + fruits);

        // contains()
        System.out.println("Contains Mango? "
                + fruits.contains("Mango"));

        // containsAll()
        Collection<String> checkFruits =
                Arrays.asList("Apple", "Mango");

        System.out.println("Contains Apple and Mango? "
                + fruits.containsAll(checkFruits));

        // size()
        System.out.println("Size: " + fruits.size());

        // isEmpty()
        System.out.println("Is collection empty? "
                + fruits.isEmpty());

        // removeAll()
        fruits.removeAll(Arrays.asList("Orange", "Grapes"));
        System.out.println("After removeAll(): " + fruits);

        // iterator()
        System.out.print("Using Iterator: ");
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // clear()
        fruits.clear();
        System.out.println("\nAfter clear(): " + fruits);

        System.out.println("Is collection empty now? "
                + fruits.isEmpty());
    }
}
