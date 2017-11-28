package io.github.bael.booksapp.web;

import io.github.bael.booksapp.domain.Trade;
import io.github.bael.booksapp.domain.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TradeController {

    @Autowired
    private TradeRepository tradeRepository;

    @RequestMapping("/trades")
    public List<Trade> index() {
        List<Trade> list = new ArrayList<>();


        tradeRepository.findAll().forEach(list::add);

        return list;
    }

}
