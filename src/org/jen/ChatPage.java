package org.jen;
//child class

public class ChatPage extends AccCreate {
	private void userName() {
		System.out.println("enter the user name");

	}
	private void passWord() {
		System.out.println("enter the password");

	}
	public static void main(String[] args) {
	ChatPage a = new ChatPage();
	
	a.userName();
	a.passWord();
	a.chatUser();
	a.profilePage();
	}

}
