package com.mjv.app.service;

import com.mjv.app.model.Bank;
import com.mjv.app.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BankService {

    private BankRepository bankRepository;

    public BankService() {
    }

    @Autowired
    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public Optional<Bank> getBankById(Long id) {
        return bankRepository.findById(id);
    }

    public Iterable<Bank> getBankList() {
        return bankRepository.findAll();
    }

    public void saveBank(Bank bank) {
        bankRepository.save(bank);
    }

    public void removeBank(Bank bank) {
        bankRepository.delete(bank);
    }

}





