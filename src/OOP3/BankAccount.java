package OOP3;

abstract class bankAccount {
    private String accountNumber;
    private String ownerName;
    protected double balance;

    //để lớp con tự do sử dụng trừ tiền
    //contruster
    public bankAccount(String accountNumber, String ownerName,double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
      if (amount > 0){
          balance += amount;
          //so du = so du + tong
          System.out.println("deposit transaction: Deposit"+amount+"money transferred into account");
      }
      else{
            System.out.println("untradeable");
      }
    }
    public boolean withdraw(double amount){
        if (balance>=amount){
            balance = -amount;
            //so tien rut = tong tien tai khoan tru di so tien muon rut
            System.out.println("You have successfully withdrawn your money." + amount);
            return true;
        }
        else{
            System.out.println("untradeable");
        return false;
        }

    }
    public abstract void showAccountInfo();
}
