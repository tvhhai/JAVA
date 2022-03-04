package com.example.demotransaction.controller;

import com.example.demotransaction.dto.request.TransferRequest;
import com.example.demotransaction.dto.response.TransferResult;
import com.example.demotransaction.exception.BankException;
import com.example.demotransaction.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
}
