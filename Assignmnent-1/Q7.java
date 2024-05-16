abstract class Account {
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("The amount must be greater than zero.");
        } else {
            balance += amount + (amount * interestRate / 100);
            System.out.println("$" + amount + " deposited to your savings account.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("The amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully from your savings account.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("The amount must be greater than zero.");
        } else {
            balance += amount;
            System.out.println("$" + amount + " deposited to your current account.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("The amount must be greater than zero.");
        } else if (balance + overdraftLimit - amount >= 0) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully from your current account.");
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount("SA01", 1000, 2.5);
        Account currentAccount = new CurrentAccount("CA01", 2000, 500);

        System.out.println("Initial Balance:");
        System.out.println("- Savings account - ");
        displayAccountBalance(savingsAccount);
        System.out.println("- Current account - ");
        displayAccountBalance(currentAccount);

        System.out.println("- Savings account transaction - ");
        depositToAccount(savingsAccount, 500);
        withdrawFromAccount(savingsAccount, 200);

        System.out.println("- Current account transaction - ");
        depositToAccount(currentAccount, 1000);
        withdrawFromAccount(currentAccount, 3700);

        System.out.println("- Remaining balance -");
        System.out.println("- Savings account - ");
        displayAccountBalance(savingsAccount);
        System.out.println("- Current account - ");
        displayAccountBalance(currentAccount);
    }

    public static void depositToAccount(Account account, double amount) {
        account.deposit(amount);
    }

    public static void withdrawFromAccount(Account account, double amount) {
        account.withdraw(amount);
    }

    public static void displayAccountBalance(Account account) {
        System.out.println("Current balance: $" + account.balance);
    }
}
