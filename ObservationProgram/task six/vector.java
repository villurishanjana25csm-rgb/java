import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> fruits = new Vector<>();

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Vector: " + fruits);

        // addElement()
        fruits.addElement("Orange");
        System.out.println("After addElement(): " + fruits);

        // get()
        System.out.println("Element at index 1: " + fruits.get(1));

        // set()
        fruits.set(1, "Grapes");
        System.out.println("After set(): " + fruits);

        // remove(int index)
        fruits.remove(2);
        System.out.println("After remove(2): " + fruits);

        // removeElement()
        fruits.removeElement("Apple");
        System.out.println("After removeElement(): " + fruits);

        // size()
        System.out.println("Size: " + fruits.size());

        // capacity()
        System.out.println("Capacity: " + fruits.capacity());

        // contains()
        System.out.println("Contains Grapes? "
                + fruits.contains("Grapes"));
    }
}
