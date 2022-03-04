package com.example.demotransaction.service.impl;

import com.example.demotransaction.dto.response.TransferResult;
import com.example.demotransaction.entity.Account;
import com.example.demotransaction.entity.AccountState;
import com.example.demotransaction.entity.TransactLog;
import com.example.demotransaction.exception.AccountException;
import com.example.demotransaction.exception.BankErrorCode;
import com.example.demotransaction.exception.BankException;
import com.example.demotransaction.exception.DummyException;
import com.example.demotransaction.repository.AccountRepository;
import com.example.demotransaction.repository.TransactLogRepository;
import com.example.demotransaction.service.BankService;
import com.example.demotransaction.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactLogRepository transactLogRepository;

    @Autowired
    private LoggingService loggingService;

    @Override
    @Transactional(rollbackOn = {Exception.class})
    public void generateSampleData() {
        List<Account> list = accountRepository.findAll();
        if (list.isEmpty()) {
            Account johnAccount = new Account("John", 1000L);
            Account bobAccount = new Account("Bob", 2000L);
            Account aliceAccount = new Account("Alice", 1500L);

            Account tomAccount = new Account("Tom", 100L);
            tomAccount.setState(AccountState.DISABLED);

            accountRepository.save(johnAccount);
            accountRepository.save(bobAccount);
            accountRepository.save(aliceAccount);
            accountRepository.save(tomAccount);
            accountRepository.flush();
        }
    }

    public Account getAccountById(long accountID) throws AccountException {
        Optional<Account> oAccount = accountRepository.findById(accountID);

        if (oAccount.isPresent()) {
            Account account = oAccount.get();
            if (account.getState() == AccountState.DISABLED) {
                throw new AccountException(BankErrorCode.ACCOUNT_DISABLED, "Account " + account.getId() + " of " + account.getOwner() + " is disabled");
            } else {
                return account;
            }
        } else {
            throw new AccountException(BankErrorCode.ID_NOT_FOUND, "Account id " + accountID + " does not exist");
        }
    }

    @Override
    @Transactional(rollbackOn = {BankException.class}, dontRollbackOn = {DummyException.class})
    public TransferResult transfer(long fromAccID, long toAccID, long amount) {
        Account fromAccount;
        Account toAccount;

        try {
            fromAccount = getAccountById(fromAccID);
            toAccount = getAccountById(toAccID);
        } catch (AccountException accountException) {
            loggingService.saveLog(fromAccID, toAccID, amount, accountException.getErrorCode(), accountException.getMessage());
            throw new BankException(accountException.getErrorCode(), "Account Error", accountException.getMessage());
        }

        if (fromAccount.getBalance() < amount) {
            String detail = "Account " + fromAccount.getId() + " of " + fromAccount.getOwner() + " does not have enough balance";
            loggingService.saveLog(fromAccID, toAccID, amount, BankErrorCode.BALANCE_NOT_ENOUGH, detail);
            throw new BankException(BankErrorCode.BALANCE_NOT_ENOUGH, "Not enough balance", detail);
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        /**  dontRollbackOn
         if (true) {
         throw new DummyException();
         } */
        Date transferDate = new Date();
        TransactLog transactLog = new TransactLog(fromAccount, toAccount, amount, transferDate);

        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);
        transactLogRepository.save(transactLog);

        loggingService.saveLog(fromAccID, toAccID, amount, BankErrorCode.SUCCESS, "Success");
        System.out.println("********************************************************************************");
        return new TransferResult(BankErrorCode.SUCCESS, "Transfer success", transferDate);
    }
}
