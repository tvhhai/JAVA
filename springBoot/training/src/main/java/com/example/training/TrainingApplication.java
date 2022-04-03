package com.example.training;

import com.example.training.ss2customannotaion.JsonNameProcessor;
import com.example.training.ss2customannotaion.SuperMan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) throws IllegalAccessException {
        SpringApplication.run(TrainingApplication.class, args);
        SuperMan superMan = new SuperMan();
        superMan.setDateOfBirth(LocalDateTime.now());
        superMan.setName("loda");

        String json = JsonNameProcessor.toJson(superMan);
        System.out.println(json);
    }

}
