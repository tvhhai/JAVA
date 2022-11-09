package com.example.demomongo.controller;

import com.example.demomongo.entity.TableConfig;
import com.example.demomongo.entity.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    @GetMapping("/")
    public ResponseEntity getAllTutorials() {
            return new ResponseEntity("helo", HttpStatus.NOT_FOUND);

    }
}
