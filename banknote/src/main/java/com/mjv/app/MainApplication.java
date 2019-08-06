package com.mjv.app;

import com.mjv.app.model.Bank;
import com.mjv.app.repository.BankRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public CommandLineRunner banknote(BankRepository repository) {
        return (args) -> {
            //delete all bank records
            repository.deleteAll();

            // save a couple of banks
            Bank b1000 = new Bank();
            b1000.setBranchCode(Integer.valueOf(1000));
            b1000.setBranchName("SeyedKhandan");
            repository.save(b1000);

            Bank b2000 = new Bank();
            b2000.setBranchCode(Integer.valueOf(2000));
            b2000.setBranchName("ValiAsr");
            repository.save(b2000);

            Bank b3000 = new Bank();
            b3000.setBranchCode(Integer.valueOf(3000));
            b3000.setBranchName("Resalat");
            repository.save(b3000);

        };
    }

}
