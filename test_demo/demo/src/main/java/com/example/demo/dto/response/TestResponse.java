package com.example.demo.dto.response;

import com.example.demo.utils.statusCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class TestResponse<T> {
    private statusCodeEnum status;
    private int statusCode;
    private String type;
    private Object response;
    private String serverVersion;

//    @Override
//    public String toString() {
//        return "NGServerResponse{" +
//                "status='" + status + '\'' +
//                ", statusCode=" + statusCode +
//                ", type='" + type + '\'' +
//                ", response=" + response +
//                ", serverVersion='" + serverVersion + '\'' +
//                '}';
//    }

}
