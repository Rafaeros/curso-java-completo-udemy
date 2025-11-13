import java.util.Locale;
import java.util.Scanner;

import models.Account;
import models.exceptions.WithdrawException;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account data\nNumber: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        Account account = new Account(number, holder, initialBalance, withdrawLimit);
        
        System.out.print("\nEnter amount for withdraw: ");
        double amount = sc.nextDouble();
        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        } catch (WithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        } finally {
            sc.close();
        }
    }
}
