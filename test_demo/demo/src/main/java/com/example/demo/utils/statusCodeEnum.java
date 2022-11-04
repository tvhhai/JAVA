package com.example.demo.utils;

public enum statusCodeEnum {

    SUCCESS(200),
    CREATED(201),
    FAIL(400),
    ERROR(400),
    NOT_AUTHORIZED(401),
    BAD_REQUEST(400),
    FORBIDDEN(403),
    SERVER_ERROR(500),
    NOT_FOUND(404),
    PERMANENT_REDIRECT(308);

    private final int value;

    statusCodeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
