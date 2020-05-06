package com.gfq.controller;

import com.gfq.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/bookAll")
    public List<Book> selectAllBooks() {
        return restTemplate.getForObject("http://localhost:8080/all", List.class);
    }
}
