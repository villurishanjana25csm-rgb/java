public class StringIndexExample {
    public static void main(String[] args) {
        try {
            String text = "Hello";
            char ch = text.charAt(10); // String length is 5
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Caught StringIndexOutOfBoundsException: String index is out of range.");
        }
    }
}
