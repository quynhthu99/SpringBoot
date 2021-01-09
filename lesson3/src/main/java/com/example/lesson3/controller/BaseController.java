package com.example.lesson3.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BaseController {

    public int userId;
    public String username;
    @ModelAttribute("BeforeRequest")
    public void beforeRequest(HttpServletRequest request, HttpServletResponse response){
        username = "Luong Quynh Thu";
    }
}
