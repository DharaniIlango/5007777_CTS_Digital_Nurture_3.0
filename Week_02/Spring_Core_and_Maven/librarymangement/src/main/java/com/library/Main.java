package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the configuration
        System.out.println("BookService bean: " + bookService);
        bookService.performService(); // Invoke a method to see if dependency is injected
    }
}

//Output:
/* --- exec:3.1.0:exec (default-cli) @ librarymanagement ---
   BookService bean: com.library.service.BookService@670002
   Service is performing using: com.library.repository.BookRepository@1f0f1111 */