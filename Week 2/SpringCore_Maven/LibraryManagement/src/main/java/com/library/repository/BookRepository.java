package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public void findAll() {
        System.out.println("Finding all books from BookRepository");
    }
}
