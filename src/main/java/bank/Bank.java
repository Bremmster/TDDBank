package bank;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Represents a bank and its operations.
 */
public class Bank {
    /**
     * Constructs a Bank object and initializes a user account with zero balance and a given account number.
     * Displays the account information and starts the main menu.
     */
    public Bank() {
        Account usrAccount = new Account(0, "SWE-AXX-69420");
        System.out.println("Account created! " + usrAccount.getACCOUNT_NUMBER() + "balance: " + usrAccount.getBalance());
        mainMenu(usrAccount);
    }

    /**
     * Displays the main menu and handles user input to perform account operations.
     *
     * @param userAccount The user's bank account.
     */
    public void mainMenu(Account userAccount) {

        while (true) {
            printOptions();
            int usrChoice = getUsrInt();
            boolean status = false;
            switch (usrChoice) {
                case 1 -> {
                    System.out.println("Amount to deposit");
                    status = userAccount.deposit(getUsrInt());
                }
                case 2 -> {
                    System.out.println("Amount to withdraw");
                    status = userAccount.withdraw(getUsrInt());
                }
                case 3 ->
                        System.out.println("Acc: " + userAccount.getACCOUNT_NUMBER() + " Current Balance " + userAccount.getBalance());
                case 4 -> System.exit(0);
            }
            System.out.println(status ? "Done" : "Task failed successfully");
        }
    }

    /**
     * Displays the available options in the main menu.
     */
    public void printOptions() {
        System.out.println("1: Deposit cash\n2: Withdraw cash\n3: Check balance\n4: exit");
    }

    /**
     * Retrieves an integer input from the user.
     *
     * @return The integer input provided by the user.
     */
    public int getUsrInt() {
        Scanner scanner = new Scanner(System.in);
        int usrChoice;

        while (true) {
            try {
                usrChoice = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Not an Integer\nPleaser enter Integer: ");
                scanner.nextLine(); // to eat the line feed that nextInt misses
            }
        }
        return usrChoice;
    }
}

