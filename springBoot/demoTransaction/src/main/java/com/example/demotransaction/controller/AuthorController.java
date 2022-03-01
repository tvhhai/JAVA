package com.example.demotransaction.controller;

import com.example.demotransaction.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PutMapping("/{id}")
    public void updateAuthorName(@PathVariable Long id, @RequestParam String name) {
        authorService.updateAuthorNameRequireNew(id, name);
    }

}
