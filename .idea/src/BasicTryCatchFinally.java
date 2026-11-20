public class BasicTryCatchFinally {
    public static void main(String[] args) {
        System.out.println("1. try / catch");
        try {
            int result = 10 / 0;
            System.out.println("  Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("  Caught: " + e.getMessage());
        }
        System.out.println("  Program continues after the catch block");
    }

}
