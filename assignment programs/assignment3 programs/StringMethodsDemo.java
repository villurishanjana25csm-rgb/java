package core_java;
import java.util.Arrays;

public class StringMethodsDemo {
public static void main(String[] args) {
String str = "  Hello, Java World!  ";
System.out.println("Original String: '" + str + "'\n");

// 1. length() - Returns the number of characters  
    int length = str.length();  
    System.out.println("1. length(): " + length);  

    // 2. trim() - Removes leading and trailing whitespace  
    String trimmed = str.trim();  
    System.out.println("2. trim(): '" + trimmed + "'");  

    // 3. charAt(index) - Returns the character at a specific position  
    char character = trimmed.charAt(7);   
    System.out.println("3. charAt(7): " + character);  

    // 4. substring(beginIndex, endIndex) - Extracts a portion of the string  
    String sub = trimmed.substring(7, 11);   
    System.out.println("4. substring(7, 11): " + sub);  

    // 5. toUpperCase() - Converts all characters to uppercase  
    String upper = trimmed.toUpperCase();  
    System.out.println("5. toUpperCase(): " + upper);  

    // 6. toLowerCase() - Converts all characters to lowercase  
    String lower = trimmed.toLowerCase();  
    System.out.println("6. toLowerCase(): " + lower);  

    // 7. contains(sequence) - Checks if a string contains a specific sequence  
    boolean hasJava = trimmed.contains("Java");  
    System.out.println("7. contains(\"Java\"): " + hasJava);  

    // 8. replace(old, new) - Replaces characters or substrings  
    String replaced = trimmed.replace("World", "Universe");  
    System.out.println("8. replace(): " + replaced);  

    // 9. indexOf(str) - Finds the index of the first occurrence of a substring  
    int firstIndex = trimmed.indexOf("a");  
    System.out.println("9. indexOf('a'): " + firstIndex);  

    // 10. lastIndexOf(str) - Finds the index of the last occurrence of a substring  
    int lastIndex = trimmed.lastIndexOf("a");  
    System.out.println("10. lastIndexOf('a'): " + lastIndex);  

    // 11. startsWith(prefix) - Checks if the string starts with a specific prefix  
    boolean starts = trimmed.startsWith("Hello");  
    System.out.println("11. startsWith(\"Hello\"): " + starts);  

    // 12. endsWith(suffix) - Checks if the string ends with a specific suffix  
    boolean ends = trimmed.endsWith("!");  
    System.out.println("12. endsWith(\"!\"): " + ends);  

    // 13. equals(anotherString) - Compares contents with case sensitivity  
    boolean isEqual = trimmed.equals("hello, java world!");  
    System.out.println("13. equals() [case-sensitive]: " + isEqual);  

    // 14. equalsIgnoreCase(anotherString) - Compares contents ignoring case  
    boolean isEqualIgnore = trimmed.equalsIgnoreCase("hello, java world!");  
    System.out.println("14. equalsIgnoreCase(): " + isEqualIgnore);  

    // 15. split(regex) - Splits the string into an array based on a matching delimiter  
    String[] words = trimmed.split(" ");  
    System.out.println("15. split(\" \"): " + Arrays.toString(words));  
}

}
