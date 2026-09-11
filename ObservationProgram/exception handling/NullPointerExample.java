public class NullPointerExample {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // Throws exception
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: Attempted to operate on a null object reference.");
        }
    }
}
