public class SingleCatchExampleFinally {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            System.out.println("This block is always executed.");
        }

        System.out.println("Program continues...");
    }
}
