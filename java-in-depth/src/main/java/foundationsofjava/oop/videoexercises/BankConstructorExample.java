package foundationsofjava.oop.videoexercises;

public class BankConstructorExample {
    private final String accountNumber;
    private final double accountBalance;
    private final String customerName;

    private final String email;

    private final String phoneNumber;

    public BankConstructorExample(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BankConstructorExample{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
