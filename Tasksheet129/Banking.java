import java.util.Scanner;

class Banking {
    private int userId;
    private int pin;
    private String name;
    private double balance;

    public Banking(int userId, int pin, String name, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    public int getUserId() {
        return userId;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Hello, " + name + ". Your current balance is: $" + balance);
    }

    public void cashIn(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void transferMoney(Banking recipient, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
        } else if (balance < amount) {
            System.out.println("Insufficient balance for this transfer.");
        } else {
            balance -= amount;
            recipient.cashIn(amount); 
            System.out.println("Transferred $" + amount + " to " + recipient.getName());
            System.out.println("Your new balance: $" + balance);
        }
    }
}

