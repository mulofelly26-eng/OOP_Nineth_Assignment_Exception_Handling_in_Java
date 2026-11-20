public class BankAccountDemo {
    public static void main(String[] args) {
        System.out.println("3-5. throw, throws and a custom exception");
        BankAccount account = new BankAccount(100.0);
        double[] withdrawals = {30.0, 500.0, -5.0};
        for (double amount : withdrawals) {
            try {
                account.withdraw(amount);
                System.out.println("  Withdrew " + amount + ", balance: " + account.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println("  " + e.getMessage() + " - short by " + e.getShortfall());
            } catch (IllegalArgumentException e) {
                System.out.println("  Invalid request: " + e.getMessage());
            }
        }
    }
}
