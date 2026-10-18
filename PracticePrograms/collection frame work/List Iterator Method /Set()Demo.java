import java.util.ArrayList;
import java.util.ListIterator;

public class SetExample {
    public static void main(String[] args) {

        ArrayList<String> dresses = new ArrayList<>();

        dresses.add("Red");
        dresses.add("Blue");
        dresses.add("Pink");

        ListIterator<String> it = dresses.listIterator();

        it.next();
        it.set("Black");

        System.out.println("Dress Colors: " + dresses);
    }
}
