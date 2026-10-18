import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> mobiles = new HashSet<>();

        mobiles.add("Samsung");
        mobiles.add("Apple");
        mobiles.add("Vivo");
        mobiles.add("Samsung");

        System.out.println("Mobile Brands: " + mobiles);
    }
}
