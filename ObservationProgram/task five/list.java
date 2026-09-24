import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ListExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        // add(E e)
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println("List: " + fruits);

        // add(int index, E element)
        fruits.add(1, "Orange");
        System.out.println("After adding Orange at index 1: " + fruits);

        // get(int index)
        System.out.println("Element at index 2: " + fruits.get(2));

        // set(int index, E element)
        fruits.set(2, "Grapes");
        System.out.println("After replacing index 2: " + fruits);

        // remove(int index)
        fruits.remove(3);
        System.out.println("After removing index 3: " + fruits);

        // indexOf()
        System.out.println("First index of Apple: "
                + fruits.indexOf("Apple"));

        // lastIndexOf()
        System.out.println("Last index of Apple: "
                + fruits.lastIndexOf("Apple"));

        // subList()
        System.out.println("SubList (index 1 to 3): "
                + fruits.subList(1, 3));

        // sort()
        fruits.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + fruits);
    }
}
