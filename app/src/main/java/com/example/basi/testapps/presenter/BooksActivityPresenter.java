package com.example.basi.testapps.presenter;

import com.example.basi.testapps.model.Book;
import com.example.basi.testapps.model.repositories.BooksRepository;
import com.example.basi.testapps.view.BooksActivityView;

import java.util.List;

/**
 * Created by Basi on 07-06-2017.
 */

public class BooksActivityPresenter {

    private BooksActivityView view;
    private BooksRepository booksRepository;

    public BooksActivityPresenter(BooksActivityView view, BooksRepository booksRepository) {
        this.view = view;
        this.booksRepository = booksRepository;
    }

    public void loadBooks() {
        List<Book> list = booksRepository.getBooks();
        if (!list.isEmpty()) {
            view.displayBooks(list);
        } else {
            view.displayNoBook();
        }
    }
}
