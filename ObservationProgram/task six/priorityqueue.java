import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // add()
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);

        System.out.println("PriorityQueue: " + queue);

        // offer()
        queue.offer(50);
        System.out.println("After offer(50): " + queue);

        // peek()
        System.out.println("Head element: " + queue.peek());

        // poll()
        System.out.println("Removed head: " + queue.poll());
        System.out.println("After poll(): " + queue);

        // remove()
        queue.remove(30);
        System.out.println("After removing 30: " + queue);

        // contains()
        System.out.println("Contains 20? "
                + queue.contains(20));

        // size()
        System.out.println("Size of queue: " + queue.size());
    }
}
