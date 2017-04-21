package org.raji.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

	

	private String name;
	private String author;
	private String title;
	
	public Book(){
		
		
	}
	public Book(String name, String author, String title) {
		super();
		this.name = name;
		this.author = author;
		this.title = title;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
}
