public class ThrowExample {

    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("You are not readyto vote");
        }

        System.out.println("You are ready to vote");
    }
}
