import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> chocolates = new ArrayList<>();

        chocolates.add("Dairy Milk");
        chocolates.add("KitKat");
        chocolates.add("5 Star");

        System.out.println("Chocolate List: " + chocolates);

        chocolates.add("Perk");

        System.out.println("After adding: " + chocolates);

        chocolates.remove("KitKat");

        System.out.println("After removing: " + chocolates);
    }
}
