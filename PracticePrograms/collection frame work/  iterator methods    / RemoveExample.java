import java.util.ArrayList;
import java.util.Iterator;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("OS");
        subjects.add("Maths");

        Iterator<String> it = subjects.iterator();

        it.next();
        it.remove();

        System.out.println("Subjects: " + subjects);
    }
}
