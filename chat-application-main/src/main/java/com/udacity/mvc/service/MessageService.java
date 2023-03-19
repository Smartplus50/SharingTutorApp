package com.udacity.mvc.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;

import com.udacity.mvc.model.ChatForm;
import com.udacity.mvc.model.ChatMessage;

@Service
public class MessageService {

	private String message;
	private List<ChatMessage> chatMsglist;
	
//	public MessageService(String message) {
//		this.message = message;
//	}
	
	@PostConstruct
	public void postConstruct() {
		this.chatMsglist = new ArrayList<>();
		System.out.println("Created messageService Bean");
	}
	
	public String upperCase() {
		return this.message.toUpperCase();
	}	
	
	public String lowerCase() {
		return this.message.toLowerCase();
	}

	public String testCase() {
		return this.message.repeat(100)+ newline + "\r\n";
	}
	
	public static String newline = System.getProperty("line.separator");

	public void addMessages(ChatForm chatForm) {
		ChatMessage newMessage = new ChatMessage();
		switch (chatForm.getMessageType()) {
		case "Say":
			newMessage.setMessage(chatForm.getUsername(), chatForm.getMessageText());
			break;
		case "Shout":
			newMessage.setMessage(chatForm.getUsername(), chatForm.getMessageText().toUpperCase());
			break;
		case "Whisper":
			newMessage.setMessage(chatForm.getUsername(), chatForm.getMessageText().toLowerCase());
			break;
		case "Test":
			newMessage.setMessageTest(chatForm.getUsername(), chatForm.getMessageText()+ newline + newline);
			break;
		}
		chatMsglist.add(newMessage);
	}
	
	public List<ChatMessage> getMessages() {
		//return new ArrayList<ChatMessage>(this.chatMsglist);
		 return chatMsglist;
	}

	
		
}
