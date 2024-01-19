package com.springboot.LearnSB.RESTController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.LearnSB.Entities.Book;
import com.springboot.LearnSB.Services.BookService;

@RestController
public class BookController {

//	@RequestMapping(value="/books",method=RequestMethod.GET)
//	@GetMapping("/books")
//	public Book getBooks() {
//
//		Book book = new Book();
//		book.setId(1);
//		book.setTitle("Java");
//		book.setAuthor("Mas");
//
//		return book;
//	}
	@Autowired
	private BookService bookService;
	@GetMapping("/books")
	public List<Book> getBooks() {
		
		return this.bookService.getAllBooks();
	}
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return this.bookService.getBookbyId(id);
	}
}
