package app.domain;
import java.time.LocalDateTime;
public class Transaction {
    private String id;
    private String accountNumber;
    private double amount;
    private LocalDateTime timestamp;
    private String note;

    public Transaction(LocalDateTime timestamp, String id, String accountNumber, double amount, String note) {
        this.timestamp = timestamp;
        this.id = id;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.note = note;
    }
}