package com.tech.SpringDataWithRedis.controller;

import com.tech.SpringDataWithRedis.entity.Product;
import com.tech.SpringDataWithRedis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableCaching
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product){
        return productDao.saveProduct(product);
    }

    @GetMapping
    public List<Product> findAllProducts(){
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    @Cacheable(key = "#id" , value="Product" ,unless = "#result.price>3000")
    public Product findProductById(@PathVariable int id){
        return productDao.findProductById(id);
    }

    @DeleteMapping("/{id}")
    @CacheEvict(key = "#id" , value="Product")
    public String deleteProductById(@PathVariable int id){
        return productDao.deleteProductById(id);
    }
}
