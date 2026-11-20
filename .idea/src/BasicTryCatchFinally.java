public class BasicTryCatchFinally {
    public static void main(String[] args) {
        System.out.println("1. try / catch / finally");
        try {
            int result = 10 / 0; // throws ArithmeticException
            System.out.println("  Result: " + result); // never reached
        } catch (ArithmeticException e) {
            System.out.println("  Caught: " + e.getMessage());
        } finally {
            System.out.println("  finally always runs");
        }
        System.out.println("  Program continues after the finally block");
    }

}
