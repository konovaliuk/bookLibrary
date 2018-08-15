package com.tzhenia.bookLibrary.service;

import com.tzhenia.bookLibrary.model.AuthorBook;
import java.util.List;

/**
 * Service interface for {@link AuthorBook} class.
 */

public interface AuthorBookService {

    AuthorBook getById(Long id);

    void save(AuthorBook authorBook);

    void delete(Long id);

    List<AuthorBook> getAll();
}
