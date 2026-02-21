package service.impl;

import domain.Account;
import repository.Account_repository;
import service.BankService;
import java.util.UUID;
public class BankServiceImpl implements BankService {

    private final Account_repository accountRepository = new Account_repository();
    @Override
    public String openAccount(String name, String email, String accountType) {
        String customerId=UUID.randomUUID().toString();
        //String accountNumber=UUID.randomUUID().toString();

        String accountNumber=getAccountNumber();
        Account account = new Account(accountNumber, customerId, (double)0, accountType);
        accountRepository.save(account);

        return "";
    }
    private String getAccountNumber()
    {
        int size= accountRepository.findAll().size()+1;
        return String.format("AC%06d", size);
    }

}
