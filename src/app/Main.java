package app;
import java.util.Scanner;
public class Main {
    public static void main(String[] argc)
    {
        Scanner scanner= new Scanner(System.in);
        boolean running=true;
        System.out.println("Welcome to Console Bank");
        while(running) {
            System.out.println("""
                     1) Open Account
                     2) Deposit
                     3) Withdraw
                     4) Transfer
                     5) Account Statement
                     6) List Accounts
                     7) Search Accounts by Customer Name
                     0) Exit
                     """);
            System.out.println("CHOOSE: ");
            String choice = scanner.nextLine().trim();
            System.out.println("CHOICE" + choice);

            switch(choice){
                case "0"->running=false;
                case "2"->openAccount(scanner);
                case "3"->deposit(scanner);
                case "4"->withdraw(scanner);
                case "5"->transfer(scanner);
                case "6"->statement(scanner);
                case "7"->listAccounts(scanner);
                case "8"->searchAccounts(scanner);
            }

        }
    }
    private static void listAccounts(Scanner scanner){}

    private static void statement(Scanner scanner ){

    }

    private static void transfer(Scanner scanner)
    {}

    private static void withdraw(Scanner scanner)
    {

    }

    private static void deposit(Scanner scanner){

    }

    private static void openAccount(Scanner scanner)
    {
        System.out.println("Customer nameL ");
        System.out.println("Customer email: ");
        System.out.println("Account Types");
    }

    private static void searchAccounts(Scanner scanner) {
    }

}
