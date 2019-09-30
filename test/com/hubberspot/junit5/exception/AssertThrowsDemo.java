package com.hubberspot.junit5.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.hubberspot.junit5.bookstore.exception.BookNotFoundException;
import com.hubberspot.junit5.bookstore.model.Book;
import com.hubberspot.junit5.bookstore.service.BookService;

public class AssertThrowsDemo {

	@Test
	public void assertThrowsWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		BookNotFoundException bookNotFoundException = assertThrows(BookNotFoundException.class, 
				() -> bookService.getBookByTitle("Head First Spring"));
		
		assertEquals("Book not found in Bookstore!", bookNotFoundException.getMessage());
	}
	
	@Test
	public void assertThrowsWithMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		assertThrows(BookNotFoundException.class,
				() -> bookService.getBookByTitle("Head First Spring"),
				"Different exception thrown!");
		
	}
	
	@Test
	public void assertThrowsWithMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		assertThrows(BookNotFoundException.class,
				() -> bookService.getBookByTitle("Head First Spring"),
				() -> "Different exception thrown!");
		
	}
	
}
