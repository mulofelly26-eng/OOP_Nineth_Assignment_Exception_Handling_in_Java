public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // 'throws' declares a checked exception the caller must handle
    public void withdraw(double amount) throws InsufficientFundsException {
        // 'throw' raises an exception
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds", amount - balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
