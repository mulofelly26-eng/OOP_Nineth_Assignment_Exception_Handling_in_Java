public class TryWithResourcesDemo {
    public static void main(String[] args) {
        System.out.println("6. try-with-resources");
        try (Connection db = new Connection("Database")) {
            db.query();
        } catch (IllegalStateException e) {
            System.out.println("  Caught: " + e.getMessage());
        }
    }
}
