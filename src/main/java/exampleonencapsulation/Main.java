package exampleonencapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 500.00);

        // ILLEGAL: This will throw a compilation error because balance is private
        // account.balance = -10000;

        // LEGAL: Accessing data safely through getters
        System.out.println(account.getAccountHolder() + "'s Balance: $" + account.getBalance());
        // Output: Alice's Balance: $500.0

        // Modifying data via authorized methods (Setters/Operations)
        account.deposit(150.00);  // Output: Deposited $150.0
        account.withdraw(1000.00); // Output: Invalid withdrawal amount or insufficient funds.

        // Final check
        System.out.println("Final Balance: $" + account.getBalance());
        // Output: Final Balance: $650.0
    }
}
