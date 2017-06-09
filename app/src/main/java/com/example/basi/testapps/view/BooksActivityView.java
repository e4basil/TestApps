package com.example.basi.testapps.view;

import com.example.basi.testapps.model.Book;

import java.util.List;

/**
 * Created by Basi on 07-06-2017.
 */

public interface BooksActivityView {

    void displayBooks(List<Book> bookList);

    void displayNoBook();
}
