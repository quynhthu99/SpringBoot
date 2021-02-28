package com.example.lesson4.helper.jdbcMapper;

import com.example.lesson4.dto.Product;
import com.example.lesson4.dto.Receipt;
import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ReceiptMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Receipt receipt = new Receipt();
        receipt.setAccountID(resultSet.getString(2));
        receipt.setReceiptID(resultSet.getString(1));
        receipt.setStatus(resultSet.getString(3));
        receipt.setTotalMoney(resultSet.getInt(4));
        return receipt;
    }
}
