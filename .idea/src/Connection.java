public class Connection implements AutoCloseable{
    private final String name;

    public Connection(String name) {
        this.name = name;
        System.out.println("  Opened " + name);
    }

    public void query() {
        throw new IllegalStateException("Query failed on " + name);
    }

    @Override
    public void close() {
        System.out.println("  Closed " + name);
    }
}
