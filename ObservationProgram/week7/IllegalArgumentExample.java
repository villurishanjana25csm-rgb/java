public class IllegalArgumentExample {
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        try {
            setAge(-5); 
        } catch (IllegalArgumentException e) {
            System.err.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}
