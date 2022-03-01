package com.example.demotransaction.service;

import com.example.demotransaction.entity.Author;

public interface AuthorService {
    void updateAuthorName(Long id, String name);

    void updateAuthorNameSupport(Long id, String name);

    void updateAuthorNameMandatory(Long id, String name);

    void updateAuthorNameRequireNew(Long id, String name);

    void updateAnotherAuthor(Long id, String name);

    Author getAuthorById(Long id);

    void updateAuthorWithRollbackCustom(Long id, String name);

}
