import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {

        NavigableSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("NavigableSet: " + numbers);

        // lower()
        System.out.println("Lower than 30: " + numbers.lower(30));

        // floor()
        System.out.println("Floor of 30: " + numbers.floor(30));

        // ceiling()
        System.out.println("Ceiling of 35: " + numbers.ceiling(35));

        // higher()
        System.out.println("Higher than 30: " + numbers.higher(30));

        // pollFirst()
        System.out.println("Removed first element: "
                + numbers.pollFirst());

        System.out.println("After pollFirst(): " + numbers);

        // pollLast()
        System.out.println("Removed last element: "
                + numbers.pollLast());

        System.out.println("After pollLast(): " + numbers);

        // descendingSet()
        System.out.println("Descending order: "
                + numbers.descendingSet());
    }
}
