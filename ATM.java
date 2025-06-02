
import java.util.HashMap;
import java.util.Map;

class ATM {
    private Bank bank;
    
    public ATM(Bank bank) {
        this.bank = bank;
    }
    
    public boolean authenticateUser(int accountNumber, int pin) {
        Account account = bank.getAccount(accountNumber);
        if (account != null && account.validatePin(pin)) {
            return true;
        }
        return false;
    }
    
    public void withdraw(int accountNumber, double amount) {
        Account account = bank.getAccount(accountNumber);
        if (account != null && account.withdraw(amount)) {
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds or account not found.");
        }
    }
    
    public void deposit(int accountNumber, double amount) {
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
    
    public void checkBalance(int accountNumber) {
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            System.out.println("Current balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

class Bank {
    private Map<Integer, Account> accounts = new HashMap<>();
    
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }
    
    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }
}

class Account {
    private int accountNumber;
    private int pin;
    private double balance;
    
    public Account(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
