import java.util.ArrayList;
import java.util.ListIterator;

public class AddExample {
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("Bag");
        items.add("Shoes");

        ListIterator<String> it = items.listIterator();

        it.next();
        it.add("Watch");

        System.out.println("Shopping Items: " + items);
    }
}
