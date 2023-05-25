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

    public boolean deposit(double cash) {
        if (cash > 0) {
            this.balance += cash;
            return true;
        }
        return false;
    }

    public boolean withdraw(double cash) {
        if (0 < cash && cash <= balance) {
            balance -= cash;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }
}
