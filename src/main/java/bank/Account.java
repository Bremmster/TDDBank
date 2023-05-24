package bank;

public class Account {

    private double balance;
    private final String ACCOUNT_NUMBER;

    public Account(double balance, String ACCOUNT_NUMBER) {
        if (balance >= 0) {
        this.balance = balance;
        } else {
            this.balance = 0;
        }
        // acc nr should be generated, unique and be possible to verify with Luhn algorithm or other algorithm
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
    }

    public void deposit(double cash) {
        if (cash > 0) {
            this.balance += cash;
        }
    }

    public void withdraw(double cash) {
        if (0 < cash && cash <= balance) {
            balance -= cash;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }
}
