import java.util.*;
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + accountBalance);
        } else {
            System.out.println("Deposit can't be -ve.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + accountBalance);
        } else if (amount > accountBalance) {
            System.out.println("yuh broke ");
        } 
        else {
            System.out.println("cant be -ve or 0 dumdum ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolderName = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);

        System.out.println("Want to desposit or withdraw or check balance? (d/w/b)");
        char choice = sc.next().charAt(0);
        if (choice == 'd' || choice == 'D') {
            System.out.print("Enter amount to deposit: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
        } else if (choice == 'w' || choice == 'W') {
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
        } else if (choice == 'b' || choice == 'B') {
            System.out.println("Account Balance: $" + account.getAccountBalance());
        } 
        else {
            System.out.println("Invalid choice "); 
        
        }
        sc.close();
        
    }
}