import java.io.FileReader;
import java.io.IOException;

public class ExceptionChainingDemo {
    static void loadConfig(String path) throws IOException {
        try (FileReader reader = new FileReader(path)) {
            reader.read();
        }
    }

    public static void main(String[] args) {
        System.out.println("7. Propagating a checked exception");
        try {
            loadConfig("missing-config.txt");
        } catch (IOException e) {
            System.out.println("  Error: " + e.getMessage());
        }
    }

}
