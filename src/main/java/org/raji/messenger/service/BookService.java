package org.raji.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.raji.messenger.model.Book;

public class BookService {
	
	public List<Book> getAllBooks(){
	
		Book  b1 = new Book("Civics", "Raji", "C123");
		Book b2 = new Book("Maths","DP","M234");
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		return books;
		
	}
	
	
	
	
	
	
	

}
