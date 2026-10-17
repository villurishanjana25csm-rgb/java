import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> games = new ArrayList<>();

        games.add("Cricket");
        games.add("Football");
        games.add("Tennis");

        ListIterator<String> it = games.listIterator();

        it.next();
        it.next();
        it.remove();

        System.out.println("Games: " + games);
    }
}
