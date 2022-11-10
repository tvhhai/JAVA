package com.example.demotransaction.controller;

import com.example.demotransaction.dto.request.TransferRequest;
import com.example.demotransaction.dto.response.TransferResult;
import com.example.demotransaction.entity.Account;
import com.example.demotransaction.exception.BankException;
import com.example.demotransaction.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class BankController {

    @Autowired
    BankService bankService;

    @PostMapping("/transfer")
    public ResponseEntity<TransferResult> transfer(@RequestBody TransferRequest transferRequest) {
        try {
            TransferResult result = bankService.transfer(
                    transferRequest.getFrom(),
                    transferRequest.getTo(),
                    transferRequest.getAmount());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            return ResponseEntity.ok().body(result);
        } catch (BankException e) {
            TransferResult transferError = new TransferResult(
                    e.getErrorCode(),
                    e.getMessage() + " : " + e.getDetail(),
                    new Date());
            System.out.println("_____________________________________________________________________________________");
            return ResponseEntity.badRequest().body(transferError);
        }
    }

    @GetMapping("/transfer")
    public ResponseEntity<List<Account>> get()  {
        return new ResponseEntity<>(bankService.getAllAccount(), HttpStatus.OK);
    }

    @PutMapping("/transfer/{id}")
    public void updateMoney(@PathVariable long id, @RequestParam long money) {
        bankService.updateMoney(id, money);
    }

}
