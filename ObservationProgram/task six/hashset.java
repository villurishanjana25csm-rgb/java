import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");   // Duplicate, not added

        System.out.println("HashSet: " + fruits);

        // remove()
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // contains()
        System.out.println("Contains Mango? "
                + fruits.contains("Mango"));

        // size()
        System.out.println("Size: " + fruits.size());

        // isEmpty()
        System.out.println("Is HashSet empty? "
                + fruits.isEmpty());

        // clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        System.out.println("Is HashSet empty now? "
                + fruits.isEmpty());
    }
}
