package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.library.service.BookService;

public class Main {
  public static void main(String[] args) {
    // Load Spring context from XML configuration file
    ApplicationContext context = new AnnotationConfigApplicationContext("com.library");

    // Retrieve BookService bean and test it
    BookService bookService = context.getBean(BookService.class);

    // Test the bean (for example, you might want to call some method here)
    System.out.println("BookService bean loaded: " + bookService);
  }
}

//Output:
/*
--- exec:3.1.0:exec (default-cli) @ librarymanagement ---
BookService bean loaded: com.library.service.BookService@4a22f9e2
 */