package com.mjv.app.model;

import javax.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Long debtorAmount;
    @Column
    private Long creditorAmount;
    @Column
    private String description;
    @ManyToOne
    private Account account;
    @Column
    private Long accountFk ;

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDebtorAmount() {
        return debtorAmount;
    }

    public void setDebtorAmount(Long debtorAmount) {
        this.debtorAmount = debtorAmount;
    }

    public Long getCreditorAmount() {
        return creditorAmount;
    }

    public void setCreditorAmount(Long creditorAmount) {
        this.creditorAmount = creditorAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getAccountFk() {
        return accountFk;
    }

    public void setAccountFk(Long accountFk) {
        this.accountFk = accountFk;
    }

    @Override
    public String toString() {
        return id + "," + debtorAmount + "," + creditorAmount + "," + description;
    }
}
