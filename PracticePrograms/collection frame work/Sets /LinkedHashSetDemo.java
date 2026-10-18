import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> subjects = new LinkedHashSet<>();

        subjects.add("Java");
        subjects.add("OS");
        subjects.add("Maths");
        subjects.add("Java");

        System.out.println("Subjects: " + subjects);
