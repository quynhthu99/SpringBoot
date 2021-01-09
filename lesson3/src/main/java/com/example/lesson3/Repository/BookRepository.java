package com.example.lesson3.Repository;

import com.example.lesson3.Model.Book;
import com.example.lesson3.Util.JdbcMapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public Book findById(int id) {
        String sql = "Select * from Book where id = ?;";
        Object[] params = {id};
        Book book = (Book) jdbcTemplate.queryForObject(sql, new BookMapper(), params);
        return book;
    }
}
