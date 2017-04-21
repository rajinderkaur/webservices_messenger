package org.raji.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.raji.messenger.model.Message;
import org.raji.messenger.service.MessageService;

@Path("/messages") // this is the path for jersey to know when we call /webapi/messeges
public class MessageResource {

	
	MessageService messageService = new  MessageService();
	
	
	
	@GET  
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
		
	}
	
	
}
