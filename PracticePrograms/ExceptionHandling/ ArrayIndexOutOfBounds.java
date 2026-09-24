public class ArrayIndexOutOfBounds{

    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException ooe) {
            System.out.println("Array index is out of bounds!");
        }
    }
}
