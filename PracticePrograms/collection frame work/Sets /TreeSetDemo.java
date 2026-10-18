import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(75);
        marks.add(90);
        marks.add(60);
        marks.add(80);
        marks.add(75);

        System.out.println("Student Marks: " + marks);
    }
}
