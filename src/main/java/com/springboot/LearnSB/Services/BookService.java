package com.springboot.LearnSB.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

	// adding the book
	public void addBook(Book b) {
		list.add(b);
	}

	// delete book
	public void deleteBook(int bookId) {
//		list.stream().filter(book -> {
//			if (book.getId() != bookId) {
//				return true;
//			}else {
//				return false;
//			}
//		}).collect(Collectors.toList());

		// OR
		list=list.stream().filter(book -> book.getId() != bookId).collect(Collectors.toList());
	}
	
	//update book
	public void updateBook(Book book,int bookId) {
		list.stream().map(b->{
			if(b.getId()==bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
	}

}
