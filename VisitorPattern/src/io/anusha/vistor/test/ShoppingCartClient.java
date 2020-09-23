package io.anusha.vistor.test;

import io.anusha.vistor.Book;
import io.anusha.vistor.Fruit;
import io.anusha.vistor.ItemElement;
import io.anusha.vistor.ShoppingCartVisitor;
import io.anusha.vistor.ShoppingCartVisitorImpl;

public class ShoppingCartClient {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(20, "1234"),
				new Book(100, "5678"), new Fruit(10, 2, "Banana"),
				new Fruit(5, 5, "Apple") };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
