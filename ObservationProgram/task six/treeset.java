import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // add()
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(30);   // Duplicate, not added

        System.out.println("TreeSet: " + numbers);

        // remove()
        numbers.remove(20);
        System.out.println("After removing 20: " + numbers);

        // contains()
        System.out.println("Contains 30? "
                + numbers.contains(30));

        // first() and last()
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // higher() and lower()
        System.out.println("Higher than 30: "
                + numbers.higher(30));
        System.out.println("Lower than 30: "
                + numbers.lower(30));

        // ceiling() and floor()
        System.out.println("Ceiling of 35: "
                + numbers.ceiling(35));
        System.out.println("Floor of 35: "
                + numbers.floor(35));

        // pollFirst()
        System.out.println("Removed first element: "
                + numbers.pollFirst());
        System.out.println("After pollFirst(): " + numbers);

        // pollLast()
        System.out.println("Removed last element: "
                + numbers.pollLast());
        System.out.println("After pollLast(): " + numbers);
    }
}
