import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationExample {
    public static void main(String[] args) {
        try {
            List<String> list = Arrays.asList("A", "B");
            list.add("C"); // Arrays.asList returns a fixed-size list; add() is unsupported
        } catch (UnsupportedOperationException e) {
            System.err.println("Caught UnsupportedOperationException: Modification not allowed.");
        }
    }
}
