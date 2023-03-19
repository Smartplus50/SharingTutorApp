package com.udacity.mvc.model;

public class ChatMessage {

	private String message;
	public static String newline = System.getProperty("line.separator");
	/*
	 * public ChatMessage(String username, String messageText) { this.message =
	 * username.concat(": " + messageText); }
	 */

	public String getMessage() {
		return message;
	}

	public String getMessageTest() {
		return message.repeat(100);
	}

	public void setMessageTest(String username, String messageText) {
		 this.message = ( "\r" + newline + username.concat(": " + messageText) + "\r" + newline).repeat(100) + "\r" + newline;
	}

	public void setMessage(String username, String messageText) {
		this.message = username.concat(": " + messageText);
	}
}
