import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorNext {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Vizag");
        cities.add("Vijayawada");
        cities.add("Hyderabad");

        ListIterator<String> it = cities.listIterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
