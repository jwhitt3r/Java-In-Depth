package foundationsofjava.oop.videoexercises;

public class Bank {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    
    private String email;
    
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance >= 0.0) this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){
        this.accountBalance += amount;
    }

    public double withdraw(double amount){
        if(this.accountBalance - amount <= 0.0) return 0.0;
        return this.accountBalance -= amount;
    }
}


