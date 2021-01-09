package com.example.lesson4.helper.jdbcMapper;


import com.example.lesson4.dto.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper {


    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setProductID(resultSet.getString(1));
        product.setDisplay(resultSet.getString(2));
        product.setPriceIn(resultSet.getInt(3));
        product.setPriceOut(resultSet.getInt(4));
        product.setPriceSale(resultSet.getInt(5));
        product.setAmount(resultSet.getInt(6));
        product.setShipday(resultSet.getInt(7));
        product.setDescription(resultSet.getString(8));
        product.setImage(resultSet.getString(9));
        product.setDeleted(resultSet.getByte(10));
        product.setCreate_at(resultSet.getString(11));
        product.setUpdate_at(resultSet.getString(12));
        return product;
    }
}
