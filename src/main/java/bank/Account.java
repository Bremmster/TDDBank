package bank;

/**
 * Represents a bank account.
 */
public class Account {

    private double balance;
    private final String ACCOUNT_NUMBER;

    /**
     * Constructs an Account object with the specified initial balance and account number.
     *
     * @param initialBalance The initial balance of the account.
     * @param ACCOUNT_NUMBER The account number of the account.
     */
    public Account(double initialBalance, String ACCOUNT_NUMBER) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
        // acc nr should be generated, unique and be possible to verify with Luhn algorithm or other algorithm
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
    }

    /**
     * Deposits the specified amount of cash into the account.
     *
     * @param amount The amount of cash to deposit.
     * @return true if the deposit is successful, false otherwise.
     */
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    /**
     * Withdraws the specified amount of cash from the account.
     *
     * @param amount The amount of cash to withdraw.
     * @return true if the withdrawal is successful, false otherwise.
     */
    public boolean withdraw(double amount) {
        if (0 < amount && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current balance of the account.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Retrieves the account number.
     *
     * @return The account number.
     */
    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }
}
