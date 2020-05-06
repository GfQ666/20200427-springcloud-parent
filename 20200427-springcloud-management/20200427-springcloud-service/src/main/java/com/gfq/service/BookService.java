package com.gfq.service;

import com.gfq.mapper.BookMapper;
import com.gfq.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询所有图书
     * @return
     */
    public List<Book> selectAll(){

        List<Book> books = bookMapper.selectAll();
        System.out.println(books);
        if (books.size()>0 && !"".equals(books)){
            return books;
        }else {
            return null;
        }
    }
}
