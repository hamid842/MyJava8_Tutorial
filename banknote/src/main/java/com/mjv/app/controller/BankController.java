package com.mjv.app.controller;

import com.mjv.app.model.Bank;
import com.mjv.app.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller

public class BankController {

    private BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/create")
    public String showCreateForm(Bank bank) {
        return "addbank";
    }

    @PostMapping("/add")
    public String addBank(@Valid Bank bank, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addbank";
        }

        bankService.saveBank(bank);
        model.addAttribute("banks", bankService.getBankList());
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Optional<Bank> bank = bankService.getBankById(id);
        if (bank == null)
            throw new IllegalArgumentException("Invalid bank Id:" + id);
        model.addAttribute("bank", bank.get());
        return "updatebank";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid Bank bank, BindingResult result, Model model) {
        if (result.hasErrors()) {
            bank.setId(id);
            return "updatebank";
        }

        bankService.saveBank(bank);
        model.addAttribute("banks", bankService.getBankList());
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        Bank bank = bankService.getBankById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid bank Id:" + id));
        bankService.removeBank(bank);
        model.addAttribute("banks", bankService.getBankList());
        return "index";
    }


}
