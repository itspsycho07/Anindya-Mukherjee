package com.bookstore.controller;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

	 @Autowired
	    private BookRepository bookRepository;

	    @Operation(summary = "Get a book by its ID")
	    @ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "Found the book",
	                     content = { @Content(mediaType = "application/json",
	                     schema = @Schema(implementation = Book.class)) }),
	        @ApiResponse(responseCode = "404", description = "Book not found",
	                     content = @Content) })
	    @GetMapping("/{id}")
	    public ResponseEntity<?> getBookById(@PathVariable Long id) {
	        Optional<Book> book = bookRepository.findById(id);
	        if (book.isPresent()) {
	            return new ResponseEntity<>(book.get(), HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
	        }
	    }

	    @Operation(summary = "Get all books")
	    @GetMapping
	    public ResponseEntity<List<Book>> getAllBooks() {
	        List<Book> books = bookRepository.findAll();
	        return new ResponseEntity<>(books, HttpStatus.OK);
	    }

	    @Operation(summary = "Add a new book")
	    @PostMapping
	    public ResponseEntity<Book> addBook(@RequestBody Book book) {
	        Book savedBook = bookRepository.save(book);
	        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
	    }

	    @Operation(summary = "Update an existing book by ID")
	    @PutMapping("/{id}")
	    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book newBook) {
	        Optional<Book> existingBook = bookRepository.findById(id);
	        if (existingBook.isPresent()) {
	            Book book = existingBook.get();
	            book.setTitle(newBook.getTitle());
	            book.setAuthor(newBook.getAuthor());
	            book.setPrice(newBook.getPrice());
	            book.setIsbn(newBook.getIsbn());
	            Book updatedBook = bookRepository.save(book);
	            return new ResponseEntity<>(updatedBook, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
	        }
	    }

	    @Operation(summary = "Delete a book by its ID")
	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
	        Optional<Book> book = bookRepository.findById(id);
	        if (book.isPresent()) {
	            bookRepository.deleteById(id);
	            return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
	        }
	    }
}
