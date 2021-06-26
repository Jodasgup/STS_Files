package AccountsTesting;

public class Accounts {

    private double balance;

 

    public Accounts(double balance) {
        this.balance = balance;
    }

 

    public double getBalance() {
        return balance;
    }

 

    public void setBalance(double balance) {
        this.balance = balance;
    }

 

    public void withdraw(double withdrawAmount) {
        this.balance = balance - withdrawAmount;
    }

 

    public void deposit(double depositAmount) {
        this.balance = balance + depositAmount;
    }
}







