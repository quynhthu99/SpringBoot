package com.example.lesson4.controller;

import com.example.lesson4.dto.ProductReceipt;
import com.example.lesson4.dto.Receipt;
import com.example.lesson4.helper.responseBuilder.ResponseForm;
import com.example.lesson4.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/receipt")
public class ReceiptController {
    @Autowired
    ReceiptService receiptService;

    @PostMapping("/create")
    public ResponseEntity<ResponseForm<Boolean>> createReceiptDetails(@RequestBody ProductReceipt productReceipt, HttpServletRequest request){
        return ResponseEntity.ok(ResponseForm.buildCustomResponse(receiptService.c,1,"oke"));

    }
}


//@GetMapping("/all")
//
//    }
//            }
