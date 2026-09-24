public class ThrowExample {

    public static void main(String[] args) {

        int age = 15;

        try {
            if (age < 18) {
                throw new ArithmeticException("You are not ready to vote");
            }

            System.out.println("You are ready to vote");

        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("This block is always executed.");
        }

        System.out.println("Program continues...");
    }
}
