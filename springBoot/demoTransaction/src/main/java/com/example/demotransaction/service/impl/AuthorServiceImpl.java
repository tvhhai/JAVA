package com.example.demotransaction.service.impl;

import com.example.demotransaction.entity.Author;
import com.example.demotransaction.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Override
    public void updateAuthorName(Long id, String name) {

    }

    @Override
    public void updateAuthorNameSupport(Long id, String name) {

    }

    @Override
    public void updateAuthorNameMandatory(Long id, String name) {

    }

    @Override
    public void updateAuthorNameRequireNew(Long id, String name) {

    }

    @Override
    public void updateAnotherAuthor(Long id, String name) {

    }

    @Override
    public Author getAuthorById(Long id) {
        return null;
    }

    @Override
    public void updateAuthorWithRollbackCustom(Long id, String name) {

    }
}
