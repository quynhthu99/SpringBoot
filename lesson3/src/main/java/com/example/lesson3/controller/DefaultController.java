package com.example.lesson3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
public class DefaultController extends BaseController {

    @GetMapping("/")
    public String helloWorld() {
        return username;
    }


}
