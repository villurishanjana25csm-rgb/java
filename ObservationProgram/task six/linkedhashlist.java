import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");   // Duplicate, not added

        System.out.println("LinkedHashSet: " + fruits);

        // remove()
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // contains()
        System.out.println("Contains Mango? "
                + fruits.contains("Mango"));

        // size()
        System.out.println("Size: " + fruits.size());

        // clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        System.out.println("Is LinkedHashSet empty? "
                + fruits.isEmpty());
    }
}
