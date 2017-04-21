package org.raji.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.raji.messenger.model.Message;

public class MessageService {

	
	public List<Message> getAllMessages(){
		Message m1 = new  Message("Hello World","Raji", 1L);
		Message m2  = new Message("Hello Jersey","Armaan",2L);
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
