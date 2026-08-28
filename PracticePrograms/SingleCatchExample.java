public class SingleCatchExample {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

