public class NumberFormatExample {
    public static void main(String[] args) {
        try {
            String invalidNumber = "abc";
            int number = Integer.parseInt(invalidNumber); // Cannot parse "abc" to int
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: Invalid format for numeric conversion.");
        }
    }
}
