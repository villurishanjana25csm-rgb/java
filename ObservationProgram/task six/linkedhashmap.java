import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        // put()
        students.put(101, "Ravi");
        students.put(102, "Priya");
        students.put(103, "Anu");

        System.out.println("LinkedHashMap: " + students);

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

        // keySet()
        System.out.println("Keys: " + students.keySet());

        // values()
        System.out.println("Values: " + students.values());

        // entrySet()
        System.out.println("Key-Value pairs: "
                + students.entrySet());
    }
}
