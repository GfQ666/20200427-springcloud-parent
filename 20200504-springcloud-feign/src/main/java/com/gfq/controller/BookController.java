package com.gfq.controller;

import com.gfq.model.Book;
import com.gfq.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping("all")
    public List<Book> selectAllBooks() {
        return iBookService.selectAllBooks();
    }
}
