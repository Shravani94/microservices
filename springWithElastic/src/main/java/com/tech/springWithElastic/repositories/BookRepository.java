package com.tech.springWithElastic.repositories;

import com.tech.springWithElastic.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book,String> {
 Book findByAuthor(String author);
}
