import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> players = new Vector<>();

        players.add("Virat");
        players.add("Rohit");
        players.add("Dhoni");

        System.out.println("Players: " + players);

        players.add("Rahul");

        System.out.println("After adding: " + players);

        players.remove("Rohit");

        System.out.println("After removing: " + players);
    }
}
