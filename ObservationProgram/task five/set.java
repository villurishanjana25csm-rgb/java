import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        // add()
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);   // Duplicate, will not be added

        System.out.println("Set: " + numbers);

        // remove()
        numbers.remove(10);
        System.out.println("After remove(10): " + numbers);

        // contains()
        System.out.println("Contains 20? " + numbers.contains(20));

        // size()
        System.out.println("Size: " + numbers.size());

        // isEmpty()
        System.out.println("Is Set empty? " + numbers.isEmpty());

        // clear()
        numbers.clear();
        System.out.println("After clear(): " + numbers);

        System.out.println("Is Set empty now? " + numbers.isEmpty());
    }
}
