import bank.Account;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link Account} class.
 */
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

    /**
     * Tests the constructor of the {@link Account} class.
     * It verifies that the balance is set to 0 when a negative initial balance is provided.
     */
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

    /**
     * Tests the {@link Account#deposit(double)} method of the {@link Account} class.
     * It verifies that the balance is correctly updated after a deposit.
     */
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

    /**
     * Tests the {@link Account#deposit(double)} method of the {@link Account} class.
     * It verifies that the deposit operation returns true when the deposit is successful.
     */
    @Test
    void depositTestTrue() {
        // Arrange
        double input = 150;
        // Act & Assert
        assertTrue(sut.deposit(input));
    }

    /**
     * Tests the {@link Account#deposit(double)} method of the {@link Account} class.
     * It verifies that the balance remains unchanged when depositing zero amount.
     */
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

    /**
     * Tests the {@link Account#deposit(double)} method of the {@link Account} class.
     * It verifies that the deposit operation returns false when attempting to deposit zero amount.
     */
    @Test
    void depositZeroTestFalse() {
        // Arrange todo
        double input = 0;
        // Act & Assert
        assertFalse(sut.deposit(input));
    }

    /**
     * Tests the {@link Account#deposit(double)} method of the {@link Account} class.
     * It verifies that the balance remains unchanged when attempting to deposit a negative amount.
     */
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

    /**
     * Tests the {@link Account#deposit(double)} method of the {@link Account} class.
     * It verifies that the deposit operation returns false when attempting to deposit a negative amount.
     */
    @Test
    void illegalDepositTestFalse() {
        // Arrange
        double input = -100; // // Negative input
        // Act & Assert
        assertFalse(sut.deposit(input));
    }

    /**
     * Tests the {@link Account#withdraw(double)} method of the {@link Account} class.
     * It verifies that the balance is correctly updated after a withdrawal.
     */
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

    /**
     * Tests the {@link Account#withdraw(double)} method of the {@link Account} class.
     * It verifies that the withdrawal operation returns true when the withdrawal is successful.
     */
    @Test
    void withdrawTestTrue() {
        // Arrange
        double input = 50;
        // Act & Assert
        assertTrue(sut.withdraw(input));
    }

    /**
     * Tests the {@link Account#withdraw(double)} method of the {@link Account} class.
     * It verifies that the balance remains unchanged when attempting to withdraw an amount larger than the balance.
     */
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

    /**
     * Tests the {@link Account#withdraw(double)} method of the {@link Account} class.
     * It verifies that the withdrawal operation returns false when attempting to withdraw an amount larger than the balance.
     */
    @Test
    void withdrawToMuchTestFalse() {
        // Arrange
        double input = 150; // attempt to overdraw account
        // Act & Assert
        assertFalse(sut.withdraw(input));
    }

    /**
     * Tests the {@link Account#withdraw(double)} method of the {@link Account} class.
     * It verifies that the balance remains unchanged when attempting to withdraw a negative amount.
     */
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

    /**
     * Tests the {@link Account#withdraw(double)} method of the {@link Account} class.
     * It verifies that the withdrawal operation returns false when attempting to withdraw a negative amount.
     */
    @Test
    void withdrawNegativeTestFalse() {
        // Arrange
        double input = -50; // Negative input
        // Act & Assert
        assertFalse(sut.withdraw(input));
    }

    /**
     * Tests the {@link Account#getACCOUNT_NUMBER()} method of the {@link Account} class.
     * It verifies that the account number is correctly retrieved.
     */
    @Test
    void checkAccountNo() {
        // Arrange
        String expected = "konto123";
        Account account = new Account(0, expected);
        // Act Assert
        assertEquals(expected, account.getACCOUNT_NUMBER());
    }
}