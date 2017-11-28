package io.github.bael.booksapp.web;

import io.github.bael.booksapp.domain.Book;
import io.github.bael.booksapp.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/")
    String index(){
        List<Book> list = new ArrayList<>();


        bookRepository.findAll().forEach(list::add);

        return list.toString();
    }
}
