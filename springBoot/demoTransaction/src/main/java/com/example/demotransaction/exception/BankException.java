package com.example.demotransaction.exception;

public class BankException extends RuntimeException {
    private final BankErrorCode errorCode;
    private final String detail;

    public BankException(BankErrorCode errorCode, String message, String detail) {
        super(message);
        this.errorCode = errorCode;
        this.detail = detail;
    }

    public String getDetail() {
        return this.detail;
    }

    public BankErrorCode getErrorCode() {
        return this.errorCode;
    }

}