package com.gfq.service;

import com.gfq.fallback.FallbackService;
import com.gfq.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "book-provider", fallbackFactory = FallbackService.class)
public interface IBookService {
    @GetMapping("all")
    List<Book> selectAllBooks();
}
