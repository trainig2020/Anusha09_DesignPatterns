package io.anusha.strategy.test;

import io.anusha.strategy.CreditCardStrategy;
import io.anusha.strategy.Item;
import io.anusha.strategy.PaypalStrategy;
import io.anusha.strategy.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Anusha Reddy", "1234567890123456", "786", "09/03"));
	}

}
