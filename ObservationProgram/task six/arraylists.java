import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // add(E e)
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println("ArrayList: " + fruits);

        // add(int index, E element)
        fruits.add(1, "Orange");
        System.out.println("After add at index 1: " + fruits);

        // get(int index)
        System.out.println("Element at index 2: " + fruits.get(2));

        // set(int index, E element)
        fruits.set(2, "Grapes");
        System.out.println("After set(): " + fruits);

        // remove(int index)
        fruits.remove(3);
        System.out.println("After remove(3): " + fruits);

        // remove(Object o)
        fruits.remove("Apple");
        System.out.println("After remove(\"Apple\"): " + fruits);

        // contains(Object o)
        System.out.println("Contains Mango? "
                + fruits.contains("Mango"));

        // size()
        System.out.println("Size: " + fruits.size());

        // isEmpty()
        System.out.println("Is ArrayList empty? "
                + fruits.isEmpty());

        // indexOf(Object o)
        System.out.println("Index of Mango: "
                + fruits.indexOf("Mango"));

        // Add Mango again to demonstrate lastIndexOf()
        fruits.add("Mango");

        // lastIndexOf(Object o)
        System.out.println("Last index of Mango: "
                + fruits.lastIndexOf("Mango"));

        // sort(Comparator)
        fruits.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: " + fruits);

        // clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        System.out.println("Is ArrayList empty now? "
                + fruits.isEmpty());
    }
}
