import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        // add(E e)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("LinkedList: " + fruits);

        // addFirst() and addLast()
        fruits.addFirst("Orange");
        fruits.addLast("Grapes");

        System.out.println("After addFirst() and addLast(): " + fruits);

        // get(int index)
        System.out.println("Element at index 2: " + fruits.get(2));

        // getFirst() and getLast()
        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Last element: " + fruits.getLast());

        // remove(int index)
        fruits.remove(2);
        System.out.println("After remove(2): " + fruits);

        // remove(Object o)
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // removeFirst() and removeLast()
        System.out.println("Removed first: " + fruits.removeFirst());
        System.out.println("After removeFirst(): " + fruits);

        System.out.println("Removed last: " + fruits.removeLast());
        System.out.println("After removeLast(): " + fruits);

        // offer(E e)
        fruits.offer("Pineapple");
        System.out.println("After offer(): " + fruits);

        // peek()
        System.out.println("Head using peek(): " + fruits.peek());

        // poll()
        System.out.println("Removed head using poll(): " + fruits.poll());
        System.out.println("After poll(): " + fruits);
    }
}
