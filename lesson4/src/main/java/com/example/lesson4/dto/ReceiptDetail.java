package com.example.lesson4.dto;

import java.util.List;

public class ReceiptDetail {
    private List<ProductReceipt> productReceipts;


    public List<ProductReceipt> getProductReceipts() {
        return productReceipts;
    }

    public void setProductReceipts(List<ProductReceipt> productReceipts) {
        this.productReceipts = productReceipts;
    }
}
