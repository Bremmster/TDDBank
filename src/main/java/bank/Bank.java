package bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

    public Bank() {
        Account usrAccount = new Account(0, "SWE-AXX-69420");
        System.out.println("Account created! " + usrAccount.getACCOUNT_NUMBER() + "balance: " + usrAccount.getBalance());
        mainMenu(usrAccount);
    }

    public void mainMenu(Account usrAccount) {

        while (true) {
            printOptions();
            int usrChoice = getUsrInt();
            boolean status = false;
            switch (usrChoice) {
                case 1 -> {
                    System.out.println("Amount to deposit");
                    status = usrAccount.deposit(getUsrInt());
                }
                case 2 -> {
                    System.out.println("Amount to withdraw");
                    status = usrAccount.withdraw(getUsrInt());
                }
                case 3 ->
                        System.out.println("Acc: " + usrAccount.getACCOUNT_NUMBER() + " Current Balance " + usrAccount.getBalance());
                case 4 -> System.exit(0);
            }
            System.out.println(status ? "Done" : "Task failed successfully");
        }
    }

    public void printOptions() {
        System.out.println("1: Deposit cash\n2: Withdraw cash\n3: Check balance\n4: exit");
    }

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

