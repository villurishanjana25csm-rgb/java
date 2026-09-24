import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Original List: " + fruits);

        // Creating ListIterator
        ListIterator<String> iterator = fruits.listIterator();

        // hasNext(), next(), nextIndex()
        System.out.println("\nForward Traversal:");

        while (iterator.hasNext()) {
            System.out.println(
                "Index: " + iterator.nextIndex()
                + ", Element: " + iterator.next()
            );
        }

        // hasPrevious(), previous(), previousIndex()
        System.out.println("\nBackward Traversal:");

        while (iterator.hasPrevious()) {
            System.out.println(
                "Index: " + iterator.previousIndex()
                + ", Element: " + iterator.previous()
            );
        }

        // add()
        iterator.add("Orange");
        System.out.println("\nAfter add(): " + fruits);

        // Move forward and use set()
        if (iterator.hasNext()) {
            iterator.next();
            iterator.set("Grapes");
        }

        System.out.println("After set(): " + fruits);

        // Move backward and use remove()
        if (iterator.hasPrevious()) {
            iterator.previous();
            iterator.remove();
        }

        System.out.println("After remove(): " + fruits);
    }
}
