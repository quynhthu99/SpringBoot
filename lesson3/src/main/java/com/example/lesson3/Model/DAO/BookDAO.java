package com.example.lesson3.Model.DAO;

import com.example.lesson3.Model.Book;
import com.example.lesson3.Util.JdbcMapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Book> getAllBooks(){
        String sql = "select * from book";
        List<Book> result = jdbcTemplate.query(sql, new BookMapper());
        return result;

    }
}
