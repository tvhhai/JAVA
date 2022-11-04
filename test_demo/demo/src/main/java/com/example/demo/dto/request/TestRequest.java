package com.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestRequest<T> {
//    private String serviceName;
//
//    private String requestID;
//
//    private int operation;
//
//    private int requestType;
//
//    private String target;

    private T request;

    private String requestUrl;
}
