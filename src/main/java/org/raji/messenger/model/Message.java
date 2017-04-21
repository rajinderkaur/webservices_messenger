package org.raji.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {
	
	private String message;
	private Date created;
	private String author;
	private Long id;
	
	public Message(){
		
	}
	
	public Message(String message, String author, Long id) {
		super();
		this.message = message;
		this.created = new Date();
		this.author = author;
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
	
}
