package com.mjv.app.service;

import com.mjv.app.enumaration.AccountStatus;
import com.mjv.app.enumaration.AccountType;
import com.mjv.app.model.Account;
import com.mjv.app.model.Bank;
import com.mjv.app.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    private List<Account> accountList;

    public AccountService() {
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public Account createAccount(Integer accountNumber,
                                 AccountType accountType,
                                 AccountStatus status,
                                 Long balance,
                                 Bank bank,
                                 Customer customer) {
        Account account = new Account();
        account.setAccountNumber(accountNumber);
        account.setAccountType(accountType);
        account.setStatus(status);
        account.setBalance(balance);
        account.setBank(bank);
        account.setCustomer(customer);
        return account;
    }


    public void readAccountDataFromFile() {
        FileService fileService = new FileService();
        List<String> fileData = fileService.readFile("account.csv");
        if (accountList == null)
            accountList = new ArrayList<>();
        else
            accountList.clear();
        //TODO
        //please complete the code
    }

    public void saveAccountDataToFile() {
        FileService fileService = new FileService();
        List<String> fileContent = new ArrayList<String>();
        for (Account account : accountList) {
            fileContent.add(account.toString());
        }
        fileService.writeFile("account.csv", fileContent);
    }

    public void addAccount(Integer accountNumber,
                           AccountType accountType,
                           AccountStatus status,
                           Long balance,
                           Bank bank,
                           Customer customer) {
        Account a = createAccount(accountNumber, accountType, status, balance, bank, customer);
        accountList.add(a);
    }

    public void removeAccount(Integer accountNumber) {
        for (Account a : accountList) {
            if (accountNumber.equals(a.getAccountNumber())) {
                accountList.remove(a);
                break;
            }
        }
    }
}
