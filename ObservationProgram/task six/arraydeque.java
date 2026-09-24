import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // addFirst() and addLast()
        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);
        deque.addLast(40);

        System.out.println("ArrayDeque: " + deque);

        // offerFirst() and offerLast()
        deque.offerFirst(5);
        deque.offerLast(50);

        System.out.println("After offerFirst() and offerLast(): " + deque);

        // peekFirst() and peekLast()
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // pollFirst()
        System.out.println("Removed first element: " + deque.pollFirst());
        System.out.println("After pollFirst(): " + deque);

        // pollLast()
        System.out.println("Removed last element: " + deque.pollLast());
        System.out.println("After pollLast(): " + deque);
    }
}
