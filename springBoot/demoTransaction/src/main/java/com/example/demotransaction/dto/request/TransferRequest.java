package com.example.demotransaction.dto.request;

import lombok.Data;

@Data
public class TransferRequest {
    private long from;
    private long to;
    private long amount;
}
