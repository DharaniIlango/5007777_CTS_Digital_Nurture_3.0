package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class Main {
  public static void main(String[] args) {
    // Load Spring context from XML configuration file
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // Retrieve BookService bean and test it
    BookService bookService = (BookService) context.getBean("bookService");
    
    // Test the bean
    System.out.println("BookService bean loaded: " + bookService);
  }
}

//Output:
/*
    --- exec:3.1.0:exec (default-cli) @ librarymanagement ---
BookService bean loaded: com.library.service.BookService@10e41621
 */