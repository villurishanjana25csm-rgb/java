import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);

        // peek()
        System.out.println("Top element: " + stack.peek());

        // pop()
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop(): " + stack);

        // empty()
        System.out.println("Is stack empty? " + stack.empty());

        // search()
        System.out.println("Position of 20: " + stack.search(20));
    }
}
