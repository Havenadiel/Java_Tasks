import java.util.Scanner;

public class bankingApp {

    private static Banking[] accounts = {
            new Banking(412435, 7452, "Chris Sandoval", 32000),
            new Banking(264863, 1349, "Marc Yim", 1000),
            //new Banking("", "", "", "")
    };

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Banking currentUser = login();
        if (currentUser != null) {
            mainMenu(currentUser);
        } else {
            System.out.println("Login failed.");
        }
    }

    // Method for login functionality
    public static Banking login() {
        System.out.print("Enter your User ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        for (Banking account : accounts) {
            if (account.getUserId() == userId && account.getPin() == pin) {
                System.out.println("Welcome, " + account.getName() + "!");
                return account;
            }
        }
        return null; // Return null if login fails
    }

    // Main menu after successful login
    public static void mainMenu(Banking currentUser) {
        int choice;
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Cash-in");
            System.out.println("3. Money Transfer");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentUser.checkBalance();
                    break;
                case 2:
                    cashInMenu(currentUser);
                    break;
                case 3:
                    moneyTransferMenu(currentUser);
                    break;
                case 4:
                    System.out.println("Thank you for using this Banking App");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Menu for cash-in (deposit money)
    public static void cashInMenu(Banking currentUser) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        currentUser.cashIn(amount);
    }

    // Menu for money transfer
    public static void moneyTransferMenu(Banking currentUser) {
        System.out.print("Enter recipient User ID: ");
        int recipientId = scanner.nextInt();
        Banking recipient = findAccountByUserId(recipientId);
        if (recipient == null) {
            System.out.println("Recipient not found.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        currentUser.transferMoney(recipient, amount);
    }

    // Method to find an account by user ID
    public static Banking findAccountByUserId(int userId) {
        for (Banking account : accounts) {
            if (account.getUserId() == userId) {
                return account;
            }
        }
        return null; // Return null if account not found
    }
}