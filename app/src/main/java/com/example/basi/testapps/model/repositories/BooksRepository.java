package com.example.basi.testapps.model.repositories;

import com.example.basi.testapps.model.Book;

import java.util.List;

/**
 * Created by Basi on 08-06-2017.
 */

public interface BooksRepository {
    List<Book> getBooks();
}
