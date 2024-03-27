import java.util.Scanner;

public class ATMInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 1000; // Initial balance

    public static void main(String[] args) {
        System.out.println("Welcome");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("\nYour balance is: Rs." + balance);
    }

    private static void withdraw() {
        System.out.print("\nEnter the amount to withdraw: Rs.");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: Rs." + balance);
        }
    }

    private static void deposit() {
        System.out.print("\nEnter the amount to deposit: Rs.");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance += amount;
            System.out.println("Deposit successful. New balance: Rs." + balance);
        }
    }
}

    
