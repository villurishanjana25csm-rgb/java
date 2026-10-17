import number.Roman;

public class RomanDemo {
    public static void main(String[] args) {
        Roman obj = new Roman();

        String roman = "LVIII";
        int result = obj.romanToInteger(roman);

        System.out.println("Roman Numeral: " + roman);
        System.out.println("Integer Value: " + result);
    }
}
