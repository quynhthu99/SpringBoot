package com.example.lesson4.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ReceiptRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public int addReceipt(String uuid,String accountID,String status,int totalMoney){
        String sql = "insert into Receipt(receiptID,accountID,total_money,status) values(?,?,?,?)";
        Object[] params = {uuid,accountID,totalMoney,status};
        return jdbcTemplate.update(sql,params);
    }
    public int addReceiptDetails(String receiptID,String productID,int amount){
        String sql = "insert into ReceiptDetail(receiptID,productID,amount) values(?,?,?)";
        Object[] params = {receiptID,productID,amount};
        return jdbcTemplate.update(sql,params);
    }



}
