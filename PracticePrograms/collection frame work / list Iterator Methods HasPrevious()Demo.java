import java.util.ArrayList;
import java.util.ListIterator;

public class HasPreviousExample {
    public static void main(String[] args) {

        ArrayList<String> snacks = new ArrayList<>();

        snacks.add("Chips");
        snacks.add("Cake");
        snacks.add("Biscuit");

        ListIterator<String> it = snacks.listIterator();

        it.next();
        it.next();
        it.next();

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
