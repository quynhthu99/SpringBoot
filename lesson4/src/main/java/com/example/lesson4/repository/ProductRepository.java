package com.example.lesson4.repository;

import com.example.lesson4.dto.Product;
import com.example.lesson4.helper.jdbcMapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getAllProduct() {
        String sql = "select * from product order by priceOut asc";
        List<Product> result = jdbcTemplate.query(sql, new ProductMapper());
        return result;

    }

//    public List<Product> getAllProductDesc() {
//        String sql = "select * from product order by priceOut desc ";
//        List<Product> result = jdbcTemplate.query(sql, new ProductMapper());
//        return result;
//    }

//    public List<Product> getAllProductSort(String type) {
//        String sql = "select * from product order by priceOut " + type;
//        //Object[] params = {type};
//        List<Product> result = jdbcTemplate.query(sql, new ProductMapper());
//        return result;
//    }

    public Product getById(String productId) {
        String sql = "select * from product where productId = ?";
        Object[] params = {productId};
        Product product = (Product) jdbcTemplate.queryForObject(sql, new ProductMapper(), params);
        return product;
    }

    public Product getByDisplay(String display) {
        String sql = "select * from product where display = ?";
        Object[] params = {display};
        Product product = (Product) jdbcTemplate.queryForObject(sql, new ProductMapper(), params);
        return product;
    }

    public Product addProduct(Product product) {
        String sql = "INSERT INTO `Product` (`productID`, `display`, `priceIn`, `priceOut`, `priceSale`, `amount`, `shipday`, `description`, `images`, `deleted`, `create_at`, `update_at`) VALUES (?,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? );";
        Object[] params = {product.getProductID(), product.getDisplay(), product.getPriceIn(), product.getPriceOut(), product.getPriceSale(), product.getAmount(), product.getShipday(), product.getDescription(), product.getImage(), product.getDeleted(), product.getCreate_at(), product.getUpdate_at()};
        jdbcTemplate.update(sql, params);
        return product;
    }

    public int updateById(Product product) {

        String sql = "update Product set display = ?, priceIn = ?, priceOut = ?, priceSale = ?," +
                " amount = ?, shipday = ?, description = ?, image = ? where productID = ?";
        return jdbcTemplate.update(sql, product.getDisplay(), product.getPriceIn(), product.getPriceOut(),
                product.getPriceSale(), product.getAmount(), product.getShipday(), product.getDescription(),
                product.getImage(), product.getProductID());

    }

    public int deleteById(String id) {
        String sql = "delete from Product where productId = ?";
        Object[] params = {id};
        return jdbcTemplate.update(sql, params);
    }

    public List<Product> getAllProduct(String sortColumn, Integer sortType) {
        // 0: ASC, 1: DESC, default ASC
        String sortStatus = sortType != null && sortType == 0
                ? " ASC"
                : " DESC";
//        if (sortType != null) {
//            if (sortType != 0) {
//                sortStatus = " DESC";
//            }
//        }
        String sql = "select * from Product where deleted = 0";
        if (sortColumn != null) {
            sql += " order by " + sortColumn + sortStatus;
        }
        System.out.printf("sql:" + sql);

        return jdbcTemplate.query(sql, new ProductMapper());
    }
}


