package io.github.bael.booksapp;

import io.github.bael.booksapp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    public DatabaseLoader(BookRepository bookRepository, TradeRepository tradeRepository, OwnerRepository ownerRepository) {
        this.bookRepository = bookRepository;
        this.tradeRepository = tradeRepository;
        this.ownerRepository = ownerRepository;
    }

    private BookRepository bookRepository;

    private TradeRepository tradeRepository;

    private OwnerRepository ownerRepository;

    @Override
    public void run(String... args) {

        Owner me = new Owner("DK");
        Owner son = new Owner("AK");
        ownerRepository.save(me);
        ownerRepository.save(son);

        Book mobi = new Book("mobi dick", "sea novel", me);
        this.bookRepository.save(mobi);

        this.bookRepository.save(new Book("game of thrones", "crown feast", me));

        Trade trade = new Trade("Created", mobi, son);

        this.tradeRepository.save(trade);


    }


}
