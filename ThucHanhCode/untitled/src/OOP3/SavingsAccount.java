package OOP3;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    //lãi suất
    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount);
    }

    @Override
    public void showAccountInfo() {

    }
}
