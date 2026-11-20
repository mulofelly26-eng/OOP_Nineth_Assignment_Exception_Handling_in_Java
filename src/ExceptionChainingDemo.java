import java.io.FileReader;
import java.io.IOException;

public class ExceptionChainingDemo {
    static void loadConfig(String path) {
        try (FileReader reader = new FileReader(path)) {
            reader.read();
        } catch (IOException e) {
            // Wrap the low-level exception, keeping the original as the "cause"
            throw new RuntimeException("Could not load configuration: " + path, e);
        }
    }

    public static void main(String[] args) {
        System.out.println("7. Exception chaining");
        try {
            loadConfig("missing-config.txt");
        } catch (RuntimeException e) {
            System.out.println("  Error: " + e.getMessage());
            System.out.println("  Root cause: " + e.getCause().getClass().getSimpleName());
        }
    }

}
