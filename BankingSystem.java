
import java.util.*;

class Bank {
    private String name;
    private List<Account> accounts = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    
    public Bank(String name) {
        this.name = name;
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public Account getAccountByNumber(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }
}

class Account {
    private int accountNumber;
    private double balance;
    private Customer owner;
    
    public Account(int accountNumber, Customer owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
    
    public boolean withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class Customer {
    private int customerId;
    private String name;
    
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
}
