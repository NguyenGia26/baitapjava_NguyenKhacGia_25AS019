package OOP3;
import java.util.UUID;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private String type; // Deposit, Withdraw, Transfer
    private double amount;
    private String fromAccount;
    private String toAccount;
    private LocalDateTime dateTime;

    //Contruster
    public Transaction(String transactionId, String type, double amount, String fromAccount, String toAccount, LocalDateTime dateTime) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.dateTime = dateTime;
    }

    public Transaction(String type, double amount, String fromAccount, String toAccount, LocalDateTime dateTime) {
        this.transactionId = String.valueOf(UUID.randomUUID()).substring(0, 8);;
        this.type = type;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.dateTime = dateTime;
    }

    // history transaction
    public void showTransactionInfo(){}
}
