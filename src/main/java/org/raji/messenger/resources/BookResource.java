package org.raji.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.raji.messenger.model.Book;
import org.raji.messenger.service.BookService;

@Path("/books")
public class BookResource {

	BookService bookService = new BookService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
}
