package com.gfq.mapper;

import com.gfq.model.Book;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface BookMapper {
     @Select("select book_id,book_name,book_price from book_info")
     List<Book> selectAll();
}
