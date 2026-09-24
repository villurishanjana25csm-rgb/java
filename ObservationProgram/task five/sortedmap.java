import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {

        SortedMap<Integer, String> students = new TreeMap<>();

        // Adding key-value pairs
        students.put(103, "Anu");
        students.put(101, "Ravi");
        students.put(105, "Kiran");
        students.put(102, "Priya");
        students.put(104, "Rahul");

        System.out.println("SortedMap: " + students);

        // firstKey()
        System.out.println("First key: " + students.firstKey());

        // lastKey()
        System.out.println("Last key: " + students.lastKey());

        // headMap()
        System.out.println("Keys less than 103: "
                + students.headMap(103));

        // tailMap()
        System.out.println("Keys greater than or equal to 103: "
                + students.tailMap(103));

        // subMap()
        System.out.println("Keys from 102 to 105: "
                + students.subMap(102, 105));

        // comparator()
        System.out.println("Comparator: " + students.comparator());
    }
}
