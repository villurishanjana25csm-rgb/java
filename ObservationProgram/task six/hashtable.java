import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableExample {
    public static void main(String[] args) {

        Hashtable<Integer, String> students = new Hashtable<>();

        // put()
        students.put(101, "Ravi");
        students.put(102, "Priya");
        students.put(103, "Anu");

        System.out.println("Hashtable: " + students);

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

        // keys()
        System.out.println("Keys:");
        Enumeration<Integer> keys = students.keys();

        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // elements()
        System.out.println("Values:");
        Enumeration<String> values = students.elements();

        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }

        // size()
        System.out.println("Size: " + students.size());

        // isEmpty()
        System.out.println("Is Hashtable empty? "
                + students.isEmpty());
    }
}
