package io.github.bael.booksapp.book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BooksController {

    @RequestMapping("/")
    String index(){
        return "Spring Boot MVC is easier";
    }
}
