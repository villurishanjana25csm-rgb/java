import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> patients = new PriorityQueue<>();

        patients.add(3);
        patients.add(1);
        patients.add(2);

        System.out.println("Patients: " + patients);

        System.out.println("First Priority: " + patients.poll());
    }
}
