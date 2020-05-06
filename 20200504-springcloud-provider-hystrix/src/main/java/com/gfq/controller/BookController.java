package com.gfq.controller;

import com.gfq.model.Book;
import com.gfq.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/all")
//    @HystrixCommand(fallbackMethod = "selectAllBooksFallbacl")
    public List<Book> selectAllBooks() throws Exception {
        List<Book> bookList = bookService.selectAll();
//        if(bookList.size() > 0) {
//            // 说明数据库中有值，说明程序是对的(按照咱们目前的情况，一定会进if中)
//            // 所以直接抛出异常
//            throw new Exception("故意抛出异常");// 必会抛出异常
//        }
        return bookList;
    }

    /**
     *  测试熔断的方法
     */
//    public List<Book> selectAllBooksFallbacl() {
//        List<Book> bookList = new ArrayList<Book>();
//        Book book = new Book();
//        book.setBookId(100000L);
//        book.setBookName("服务熔断");
//        bookList.add(book);
//        return bookList;
//    }
}
