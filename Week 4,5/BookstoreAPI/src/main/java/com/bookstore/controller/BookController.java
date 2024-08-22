package com.bookstore.controller;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookRepository.save(book));
    }

   

    // Customer Registration (JSON)
    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestBody Map<String, String> customerData) {
        String name = customerData.get("name");
        String email = customerData.get("email");
        String password = customerData.get("password");

        // Logic to save the customer data (e.g., save to a database or log it)
        // Since we're not using a Customer entity in this example, we're just logging it
        System.out.println("Customer registered: " + name + ", " + email);

        return ResponseEntity.ok("Customer registered successfully!");
    }

    // Customer Registration (Form Data)
    @PostMapping("/register/form")
    public ResponseEntity<String> registerCustomerWithForm(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password) {

        // Logic to save the customer data (e.g., save to a database or log it)
        System.out.println("Customer registered (form): " + name + ", " + email);

        return ResponseEntity.ok("Customer registered successfully via form!");
    }
}
