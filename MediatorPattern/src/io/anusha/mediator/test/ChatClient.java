package io.anusha.mediator.test;

import io.anusha.mediator.ChatMediator;
import io.anusha.mediator.ChatMediatorImpl;
import io.anusha.mediator.User;
import io.anusha.mediator.UserImpl;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Anu");
		User user2 = new UserImpl(mediator, "Akhi");
		User user3 = new UserImpl(mediator, "Amesha");
		User user4 = new UserImpl(mediator, "Prathyusha");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
		
	}

}

