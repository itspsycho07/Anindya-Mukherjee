package com.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BookDTO {
    
    @JsonProperty("book_id")
    private Long id;

    @JsonProperty("book_title")
    private String title;

    @JsonProperty("book_author")
    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double price;

    @JsonProperty("isbn_number")
    private String isbn;

    // Getters and Setters

	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

    // Getters and Setters
}
