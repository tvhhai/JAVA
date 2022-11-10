package com.example.demotransaction.service;

import com.example.demotransaction.dto.response.TransferResult;
import com.example.demotransaction.entity.Account;
import com.example.demotransaction.exception.AccountException;

import java.util.List;

public interface BankService {
    void generateSampleData();
    Account getAccountById(long accountID) throws AccountException;
    TransferResult transfer(long fromAccID, long toAccID, long amount);
    List<Account> getAllAccount();
    void updateMoney(long id, long amount);

}
