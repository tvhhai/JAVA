package com.example.demotransaction.service;

import com.example.demotransaction.exception.BankErrorCode;

public interface LoggingService {
    void saveLog(long fromID, long toID, Long amount, BankErrorCode resultCode, String detail);
}
