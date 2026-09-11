import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("test.txt");
            reader.close();
            reader.read(); // Reading from a closed stream throws IOException
        } catch (IOException e) {
            System.err.println("Caught IOException: An I/O error occurred.");
        }
    }
}
