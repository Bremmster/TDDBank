import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void depositTest() {
        // Arrange
        Account account = new Account(100, "test-account1");
        double expected = 200;
        double input = 100;
        // Act
        account.deposit(input);
        double actual = account.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void illegalDepositTest() {
        // Arrange
        Account account = new Account(100, "test-account1");
        double expected = 100;
        double input = -100; // Negative input
        // Act
        account.deposit(input);
        double actual = account.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void withdrawTest() {
        // Arrange
        Account account = new Account(100, "test-account1");
        double expected = 50;
        double input = 50;
        // Act
        account.withdraw(input);
        double actual = account.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void withdrawToMuchTest() {
        // Arrange
        Account account = new Account(100, "test-account1");
        double expected = 100;
        double input = 150; // attempt to overdraw account
        // Act
        account.withdraw(input);
        double actual = account.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void withdrawNegativeTest() {
        // Arrange
        Account account = new Account(100, "test-account1");
        double expected = 100;
        double input = -50; // Negative input
        // Act
        account.withdraw(input);
        double actual = account.getBalance();
        // Assert
        assertEquals(expected, actual);
    }
}