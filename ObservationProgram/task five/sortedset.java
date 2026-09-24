import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {

        SortedSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("SortedSet: " + numbers);

        // first()
        System.out.println("First element: " + numbers.first());

        // last()
        System.out.println("Last element: " + numbers.last());

        // headSet()
        System.out.println("Elements less than 30: "
                + numbers.headSet(30));

        // tailSet()
        System.out.println("Elements greater than or equal to 30: "
                + numbers.tailSet(30));

        // subSet()
        System.out.println("Elements from 20 to 50: "
                + numbers.subSet(20, 50));

        // comparator()
        System.out.println("Comparator: " + numbers.comparator());
    }
}
