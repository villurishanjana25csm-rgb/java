 import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // addFirst() and addLast()
        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);
        deque.addLast(40);

        System.out.println("Deque: " + deque);

        // offerFirst() and offerLast()
        deque.offerFirst(5);
        deque.offerLast(50);

        System.out.println("After offerFirst() and offerLast(): "
                + deque);

        // peekFirst() and peekLast()
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // removeFirst()
        System.out.println("Removed first element: "
                + deque.removeFirst());
        System.out.println("After removeFirst(): " + deque);

        // removeLast()
        System.out.println("Removed last element: "
                + deque.removeLast());
        System.out.println("After removeLast(): " + deque);

        // pollFirst()
        System.out.println("Removed first using pollFirst(): "
                + deque.pollFirst());
        System.out.println("After pollFirst(): " + deque);

        // pollLast()
        System.out.println("Removed last using pollLast(): "
                + deque.pollLast());
        System.out.println("After pollLast(): " + deque);
    }
}
