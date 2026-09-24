import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        // put()
        students.put(103, "Anu");
        students.put(101, "Ravi");
        students.put(105, "Kiran");
        students.put(102, "Priya");
        students.put(104, "Rahul");

        System.out.println("TreeMap: " + students);

        // get()
        System.out.println("Value for key 103: "
                + students.get(103));

        // remove()
        students.remove(105);
        System.out.println("After removing key 105: "
                + students);

        // containsKey()
        System.out.println("Contains key 102? "
                + students.containsKey(102));

        // containsValue()
        System.out.println("Contains value Anu? "
                + students.containsValue("Anu"));

        // firstKey() and lastKey()
        System.out.println("First key: "
                + students.firstKey());

        System.out.println("Last key: "
                + students.lastKey());

        // higherKey() and lowerKey()
        System.out.println("Key higher than 102: "
                + students.higherKey(102));

        System.out.println("Key lower than 102: "
                + students.lowerKey(102));

        // ceilingKey() and floorKey()
        System.out.println("Ceiling key of 103: "
                + students.ceilingKey(103));

        System.out.println("Floor key of 103: "
                + students.floorKey(103));

        // entrySet()
        System.out.println("Key-Value pairs: "
                + students.entrySet());
    }
}
