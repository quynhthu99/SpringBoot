package com.example.lesson4.repository;

import com.example.lesson4.dto.Product;
import com.example.lesson4.helper.jdbcMapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getAllProduct() {
        String sql = "select * from product";
        List<Product> result = jdbcTemplate.query(sql, new ProductMapper());
        return result;

    }

    public Product getById(String productId) {
        String sql = "select * from product where productId = ?";
        Object[] params = {productId};
        Product product = (Product) jdbcTemplate.queryForObject(sql, new ProductMapper(), params);
        return product;
    }


    public Product addProduct(Product product) {
        String sql = "INSERT INTO `Product` (`productID`, `display`, `priceIn`, `priceOut`, `priceSale`, `amount`, `shipday`, `description`, `images`, `deleted`, `create_at`, `update_at`) VALUES (?,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? );";
        Object[] params = {product.getProductID(),product.getDisplay(),product.getPriceIn(),product.getPriceOut(),product.getPriceSale(),product.getAmount(),product.getShipday(),product.getDescription(),product.getImage(),product.getDeleted(),product.getCreate_at(),product.getUpdate_at()};
        jdbcTemplate.update(sql,params);
        return product;
    }

}
