package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("=== Bank Account System ===\n");

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            System.out.print("\nChoose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Surname: ");
                    String surname = scanner.nextLine();
                    System.out.print("Account Number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Initial Balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Withdrawal Limit: ");
                    int limit = scanner.nextInt();

                    account = new BankAccount(name, surname, accountNumber, balance, limit);
                    System.out.println("\nAccount created successfully!");
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("Create an account first!");
                        break;
                    }
                    System.out.print("Amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposited: " + depositAmount);
                    System.out.println("New balance: " + account.balance);
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("Create an account first!");
                        break;
                    }
                    System.out.print("Amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    double oldBalance = account.balance;
                    account.withdraw(withdrawAmount);
                    if (oldBalance == account.balance) {
                        System.out.println("Withdrawal failed! Amount exceeds limit or balance.");
                    } else {
                        System.out.println("Withdrawn: " + withdrawAmount);
                        System.out.println("New balance: " + account.balance);
                    }
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("Create an account first!");
                        break;
                    }
                    System.out.println("\n" + account.toString());
                    System.out.println("Withdrawal Limit: " + account.limit);
                    break;

                case 5:
                    System.out.println("closing...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}