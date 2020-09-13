package com.example.spring5webapp.repositories;

import com.example.spring5webapp.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
