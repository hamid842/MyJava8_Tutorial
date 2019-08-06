package com.mjv.app.repository;

import com.mjv.app.model.Bank;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BankRepository extends CrudRepository<Bank, Long> {
    List<Bank> findByBranchCode(Integer branchCode);
}
