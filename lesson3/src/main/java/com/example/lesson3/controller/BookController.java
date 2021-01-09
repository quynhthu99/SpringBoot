package com.example.lesson3.controller;


import com.example.lesson3.Model.DAO.BookDAO;
import com.example.lesson3.Model.Book;
import com.example.lesson3.Service.BookService;
import com.example.lesson3.Util.ResponseBuilder.ResponseForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
//    @Autowired
//    BookDAO bookDAO;
//
//    //get all books
//    @GetMapping("/all")
//    public List<Book> getAllBooks() {
//        return bookDAO.getAllBooks();
//    }

    //getById
    @GetMapping("/find-by-id")
    public ResponseEntity<ResponseForm<Book>> getById(@RequestParam int id) {
        // return bookService.findById(id);
        Book book = bookService.findById(id);
        return ResponseEntity.ok(ResponseForm.buildCustomResponse(book, 1, "okokok"));
    }

}
