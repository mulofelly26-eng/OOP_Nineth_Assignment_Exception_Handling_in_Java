public class MultipleCatchDemo {
    public static void main(String[] args) {
        System.out.println("2. Multiple catch blocks");
        String[] inputs = {"42", "abc", null};
        for (String input : inputs) {
            try {
                int number = Integer.parseInt(input);
                System.out.println("  Parsed: " + number);
            } catch (NumberFormatException e) {
                System.out.println("  Not a valid number: " + input);
            } catch (RuntimeException e) {
                // Always put more specific exceptions BEFORE general ones
                System.out.println("  Unexpected problem: " + e.getClass().getSimpleName());
            }
        }
        try {
            int[] numbers = new int[3];
            numbers[5] = 1;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("  Multi-catch caught: " + e.getMessage());
        }
    }
}
