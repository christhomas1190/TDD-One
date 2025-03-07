package rocks.zipcode;

/** 
 * EXERCISE 2: BankAccount
 * 
 * Implement a BankAccount class that passes all the tests.
 * The class should handle deposits, withdrawals, and maintain a balance.
 */


// Student must implement this class
public class BankAccount {
    // TODO: Implement this class to make the tests pass
    String accountNumber;
    String ownerName;
    Double balance;

    
    public BankAccount(String accountNumber, String ownerName) {
//        BankAccount number = new BankAccount(accountNumber, ownerName);
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public String getOwnerName() {
        // Your implementation here
        return this.ownerName;
    }
    
    public double getBalance() {
        // Your implementation here
        return this.balance;
    }
    
    public void deposit(double amount) {
        if(amount>0){
            this.balance+=amount;
        } if(amount<0){
            System.out.println("Deposit amount must be positive");
        }
    }
    
    public void withdraw(double amount) {
        // Your implementation here
        if(amount>0 && amount>=this.balance){
            this.balance-=amount;
        }else if(amount>0 && amount>this.balance){
            System.out.println("Insufficient funds");
        }
    }
}
