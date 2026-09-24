import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {

        NavigableMap<Integer, String> students = new TreeMap<>();

        // Adding key-value pairs
        students.put(101, "Ravi");
        students.put(102, "Priya");
        students.put(103, "Anu");
        students.put(104, "Kiran");
        students.put(105, "Rahul");

        System.out.println("NavigableMap: " + students);

        // lowerKey()
        System.out.println("Key lower than 103: "
                + students.lowerKey(103));

        // floorKey()
        System.out.println("Floor key of 103: "
                + students.floorKey(103));

        // ceilingKey()
        System.out.println("Ceiling key of 103: "
                + students.ceilingKey(103));

        // higherKey()
        System.out.println("Key higher than 103: "
                + students.higherKey(103));

        // firstEntry()
        System.out.println("First entry: "
                + students.firstEntry());

        // lastEntry()
        System.out.println("Last entry: "
                + students.lastEntry());

        // pollFirstEntry()
        System.out.println("Removed first entry: "
                + students.pollFirstEntry());

        System.out.println("After pollFirstEntry(): "
                + students);

        // pollLastEntry()
        System.out.println("Removed last entry: "
                + students.pollLastEntry());

        System.out.println("After pollLastEntry(): "
                + students);

        // descendingMap()
        System.out.println("Descending Map: "
                + students.descendingMap());
    }
}
