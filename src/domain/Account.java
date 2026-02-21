package domain;

public class Account {
     private String AccountNumber;
     private  String customerId;
     private double balance;
     private String accountType;

     public Account(String AccountNumber, String customerId, double balance, String accountType)
     {
         this.AccountNumber=AccountNumber;
         this.accountType=accountType;
         this.customerId=customerId;
         this.balance=balance;
     }
     public String getAccountNumber(){
         return AccountNumber;
     }
     public void setAccountNumber(String accountNumber){
         this.AccountNumber=accountNumber;
     }


}
