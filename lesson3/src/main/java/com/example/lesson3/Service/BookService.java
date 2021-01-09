package com.example.lesson3.Service;

import com.example.lesson3.Model.Book;
import com.example.lesson3.Repository.BookRepository;
import com.example.lesson3.Util.JdbcMapper.BookMapper;
import com.sun.jmx.mbeanserver.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book findById(int id) {
        return bookRepository.findById(id);
    }


}
