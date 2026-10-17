import java.util.ArrayList;
import java.util.Iterator;

public class HasNextExample {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();

        movies.add("RRR");
        movies.add("Pushpa");
        movies.add("Bahubali");

        Iterator<String> it = movies.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
