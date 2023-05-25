import bank.Account;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account sut;

    @BeforeEach
    void setUp() {
        sut = new Account(100, "test-account1");
    }

    @AfterEach
    void takeDown() {
        sut = null;
    }

    @Test
    void constructorTest() {
        // Arrange
        Account account = new Account(-100, "test-constructor"); // attempt to start account with negativ value
        double expected = 0;
        // Act
        double actual = account.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void depositTest() {
        // Arrange
        double expected = 200;
        double input = 100;
        // Act
        sut.deposit(input);
        double actual = sut.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void depositTestTrue() {
        // Arrange
        double input = 150;
        // Act & Assert
        assertTrue(sut.deposit(input));
    }

    @Test
    void depositZeroTest() {
        // Arrange
        double expected = 100;
        double input = 0;
        // Act
        sut.deposit(input);
        double actual = sut.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void depositZeroTestFalse() {
        // Arrange todo
        double input = 0;
        // Act & Assert
        assertFalse(sut.deposit(input));
    }

    @Test
    void illegalDepositTest() {
        // Arrange
        double expected = 100;
        double input = -100; // Negative input
        // Act
        sut.deposit(input);
        double actual = sut.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void illegalDepositTestFalse() {
        // Arrange
        double input = -100; // // Negative input
        // Act & Assert
        assertFalse(sut.deposit(input));
    }

    @Test
    void withdrawTest() {
        // Arrange
        double expected = 50;
        double input = 50;
        // Act
        sut.withdraw(input);
        double actual = sut.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void withdrawTestTrue() {
        // Arrange
        double input = 50;
        // Act & Assert
        assertTrue(sut.withdraw(input));
    }

    @Test
    void withdrawToMuchTest() {
        // Arrange
        double expected = 100;
        double input = 150; // attempt to overdraw account
        // Act
        sut.withdraw(input);
        double actual = sut.getBalance();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void withdrawToMuchTestFalse() {
        // Arrange
        double input = 150; // attempt to overdraw account
        // Act & Assert
        assertFalse(sut.withdraw(input));
    }

    @Test
    void withdrawNegativeTest() {
        // Arrange
        double expected = 100;
        double input = -50; // Negative input
        // Act
        sut.withdraw(input);
        double actual = sut.getBalance();
        // Assert
        assertEquals(expected, actual);

    }

    @Test
    void withdrawNegativeTestFalse() {
        // Arrange
        double input = -50; // Negative input
        // Act & Assert
        assertFalse(sut.withdraw(input));
    }

    @Test
    void checkAccountNo() {
        // Arrange
        String expected = "konto123";
        Account account = new Account(0, expected);
        // Act Assert
        assertEquals(expected, account.getACCOUNT_NUMBER());
    }
}