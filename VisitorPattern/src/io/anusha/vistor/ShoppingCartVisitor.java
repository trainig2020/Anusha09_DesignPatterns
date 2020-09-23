package io.anusha.vistor;

public interface ShoppingCartVisitor {

	int visit(Book book);

	int visit(Fruit fruit);
}