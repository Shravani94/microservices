package com.tech.SpringDataWithRedis.repository;

import com.tech.SpringDataWithRedis.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDao {

    public static final String HASH_KEY = "Product";

    @Autowired
    private RedisTemplate template;

    public Product saveProduct(Product product){
        template.opsForHash().put(HASH_KEY,product.getId(),product);
        return product;
    }
    public List<Product> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public Product findProductById(int id){
        System.out.println("called findByProductId() from db");
        return (Product) template.opsForHash().get(HASH_KEY,id);
    }
    public String deleteProductById(int id){
        template.opsForHash().delete(HASH_KEY,id);
        return "product Removed";
    }
}
