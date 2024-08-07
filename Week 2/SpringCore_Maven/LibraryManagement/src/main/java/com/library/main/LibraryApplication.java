package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryApplication {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        // Load the Spring context
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the configuration
        bookService.listBooks();
    }
}
