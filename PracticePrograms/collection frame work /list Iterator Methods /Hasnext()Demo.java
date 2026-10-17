import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorHasNext {
    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        ListIterator<String> it = days.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
