package com.example.basi.testapps.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.basi.testapps.R;
import com.example.basi.testapps.model.Book;
import com.example.basi.testapps.presenter.BooksActivityPresenter;
import com.example.basi.testapps.view.BooksActivityView;

import java.util.List;

public class BooksActivity extends AppCompatActivity implements BooksActivityView{

    private BooksActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        presenter = new BooksActivityPresenter(this, null);
    }

    @Override
    public void displayBooks(List<Book> bookList) {

    }

    @Override
    public void displayNoBook() {

    }
}
