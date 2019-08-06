package com.mjv.app.model;

import com.mjv.app.enumaration.AccountStatus;
import com.mjv.app.enumaration.AccountType;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Integer accountNumber;
    @Column
    private AccountType accountType;
    @Column
    private AccountStatus status;
    @Column
    private Long balance;
    @ManyToOne
    private Bank bank;
    @Column
    private Long bankFk;
    @ManyToOne
    private Customer customer;
    @Column
    private Long customerFk;

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getBankFk() {
        return bankFk;
    }

    public void setBankFk(Long bankFk) {
        this.bankFk = bankFk;
    }

    public Long getCustomerFk() {
        return customerFk;
    }

    public void setCustomerFk(Long customerFk) {
        this.customerFk = customerFk;
    }

    @Override
    public String toString() {
        return accountNumber + "," + accountType + "," + status + "," + balance + "," + bank + "," + customer;
    }
}
