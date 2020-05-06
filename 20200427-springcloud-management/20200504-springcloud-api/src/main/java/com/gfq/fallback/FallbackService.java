package com.gfq.fallback;

import com.gfq.model.Book;
import com.gfq.service.IBookService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FallbackService implements FallbackFactory<IBookService> {

    public IBookService create(Throwable throwable) {
        IBookService bookService = new IBookService() {
            public List<Book> selectAllBooks() {
                System.out.println("服务器维修中，请稍后再试");
                return null;
            }
        };
        return bookService;
    }
}
