import java.util.Scanner;

public class ExercicioContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine(); // consume the remaining newline
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char hasInitialDeposit = sc.next().charAt(0);
        Account account;
        if (hasInitialDeposit == 'y') {
            System.out.print("Enter initial deposit amount: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);
        }
        System.out.println("Account data:");
        System.out.print(account);

        System.out.print("\nEnter a deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.depositBalance(depositAmount);

        System.out.print("\nEnter a withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        account.withdrawBalance(withdrawalAmount);

        sc.close();
    }
}

class Account {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    // Constructors
    Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    Account(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        depositBalance(accountBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    private double getAccountBalance() {
        return accountBalance;
    }

    // No setter for accountBalance to prevent direct modification
    public void depositBalance(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Updated account data:");
            System.out.print(this);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdrawBalance(double amount) {
        double tax = 5.0;
        if (amount + tax <= getAccountBalance()) {
            accountBalance -= (amount + tax);
            System.out.println("Updated account data:");
            System.out.print(this);
        } else {
            System.out.println("Insufficient balance for this withdrawal including tax.");
        }
    }

    @Override
    public String toString() {
        return "Account " +
                getAccountNumber() +
                ", Holder: " +
                getAccountHolder() +
                ", Balance: $ " +
                String.format("%.2f", getAccountBalance());
    }

}