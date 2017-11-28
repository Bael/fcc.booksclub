package io.github.bael.booksapp;

import io.github.bael.booksapp.domain.Book;
import io.github.bael.booksapp.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    public DatabaseLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    private BookRepository bookRepository;

    @Override
    public void run(String... args) {

        this.bookRepository.save(new Book("mobi dick", "sea novel"));

        this.bookRepository.save(new Book("game of thrones", "crown feast"));

    }


}
