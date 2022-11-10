package com.example.demotransaction.seed;

import com.example.demotransaction.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private BankService bankService;

    @Override
    public void run(String... args) throws Exception {
        bankService.generateSampleData();
    }
}
