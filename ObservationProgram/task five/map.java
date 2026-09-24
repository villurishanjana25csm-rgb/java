import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        // put()
        students.put(101, "Ravi");
        students.put(102, "Priya");
        students.put(103, "Anu");

        System.out.println("Map: " + students);

        // get()
        System.out.println("Value for key 102: "
                + students.get(102));

        // remove()
        students.remove(103);
        System.out.println("After removing key 103: "
                + students);

        // containsKey()
        System.out.println("Contains key 101? "
                + students.containsKey(101));

        // containsValue()
        System.out.println("Contains value Ravi? "
                + students.containsValue("Ravi"));

        // keySet()
        System.out.println("Keys: " + students.keySet());

        // values()
        System.out.println("Values: " + students.values());

        // entrySet()
        System.out.println("Key-Value pairs: "
                + students.entrySet());

        // size()
        System.out.println("Size: " + students.size());

        // isEmpty()
        System.out.println("Is Map empty? "
                + students.isEmpty());

        // clear()
        students.clear();
        System.out.println("After clear(): " + students);

        System.out.println("Is Map empty now? "
                + students.isEmpty());
    }
}
