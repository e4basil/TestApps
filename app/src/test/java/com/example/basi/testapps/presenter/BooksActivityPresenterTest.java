package com.example.basi.testapps.presenter;

import com.example.basi.testapps.model.Book;
import com.example.basi.testapps.model.repositories.BooksRepository;
import com.example.basi.testapps.view.BooksActivityView;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Basi on 07-06-2017.
 */
public class BooksActivityPresenterTest {
    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void shouldPass() {
        Assert.assertEquals(true, true);
    }


    @Test
    public void shouldPassBooksToView() {
        //given
        BooksActivityView view = new MockView();
        BooksRepository booksRepository = new MockBooksRepository(true);

        // when
        BooksActivityPresenter presenter = new BooksActivityPresenter(view, booksRepository);
        presenter.loadBooks();
        // then
        Assert.assertEquals(true, ((MockView) view).passed);

    }

    @Test
    public void shouldPassNoBookToView() {
        BooksActivityView view = new MockView();
        BooksRepository booksRepository = new MockBooksRepository(false);


        BooksActivityPresenter presenter = new BooksActivityPresenter(view, booksRepository);

        presenter.loadBooks();

        Assert.assertEquals(true, ((MockView) view).noBook);
    }

    private class MockView implements BooksActivityView {

        boolean passed;
        boolean noBook;

        @Override
        public void displayBooks(List<Book> bookList) {
            passed = true;
        }

        @Override
        public void displayNoBook() {
            noBook = true;
        }
    }

    private class MockBooksRepository implements BooksRepository {

        private boolean retSomeBooks;

        public MockBooksRepository(boolean retBooks) {
            this.retSomeBooks = retBooks;
        }

        @Override
        public List<Book> getBooks() {
            if (retSomeBooks) {
                return Arrays.asList(new Book(1, "a"), new Book(2, "b"), new Book(3, "c"));
            } else {
                return Collections.emptyList();
            }
        }
    }
}


