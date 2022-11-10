package com.example.demotransaction.dto.response;

import com.example.demotransaction.exception.BankErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class TransferResult {
    private BankErrorCode resultCode; //200 success, 404 account not found, 405 balance not enought
    private String message;
    private Date transferDate;
}
