package com.springboot.LearnSB.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.LearnSB.Entities.Book;

@Component
public class BookService {
	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(2, "Python", "Goku"));
		list.add(new Book(3, "SQL", "Gohan"));
		list.add(new Book(4, "JSP", "Vegeta"));
	}

	public List<Book> getAllBooks() {
		return list;
	}

	// get single book by id

	public Book getBookbyId(int id) {
		Book book = null;
		book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;
	}
}
