import java.util.ArrayList;
import java.util.Iterator;

public class NextExample {
    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("OS");
        subjects.add("Maths");

        Iterator<String> it = subjects.iterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
