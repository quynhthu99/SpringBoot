package com.example.lesson4.helper.jdbcMapper;

import com.example.lesson4.dto.ProductReceipt;
import com.example.lesson4.dto.ReceiptDetail;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReceiptDetailMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {

        return null;
    }
}

