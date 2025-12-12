package OOP3;

public class savingsAccount extends bankAccount{
    private double interestRate;
    //lãi suất
    public savingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }
    @Override
    public boolean withdraw(double amount) {
        if (getBalance()<100000){
            System.out.println("transaction failed");
            return false;
        }
        if (amount>getBalance()){
            System.out.println("transaction failed");
        }return false;
    }

    @Override
    public void showAccountInfo() {

    }

}
