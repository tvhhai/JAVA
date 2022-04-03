package com.example.training.ss2customannotaion;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME) // Tồn tại trong lúc chạy chương trình
@Target({TYPE, FIELD, METHOD}) // Được sử dụng trên class, interface, method, biến
public @interface JsonName {
    String value();
}
