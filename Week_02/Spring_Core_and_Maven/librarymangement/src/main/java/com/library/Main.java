package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the configuration and logging
        System.out.println("BookService bean: " + bookService);
        bookService.performService(); // Invoke a method to see logging
    }
}

//Output:
/*
--- exec:3.1.0:exec (default-cli) @ librarymanagement ---
BookService bean: com.library.service.BookService@5d99c6b5
Service is performing using: com.library.repository.BookRepository@1187c9e8
[main] INFO com.library.aspect.LoggingAspect - void com.library.service.BookService.performService() executed in 17ms
*/