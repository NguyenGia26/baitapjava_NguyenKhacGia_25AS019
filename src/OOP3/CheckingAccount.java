package OOP3;

public class CheckingAccount extends bankAccount{
    public CheckingAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            return true;
        } else {
            System.out.println("Giao dịch thất bại: Số dư không đủ.");
            return false;
        }
    }

    @Override
    public void showAccountInfo() {

    }
}
