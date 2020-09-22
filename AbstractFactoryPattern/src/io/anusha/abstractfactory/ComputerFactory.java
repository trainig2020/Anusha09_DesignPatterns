package io.anusha.abstractfactory;

import io.anusha.model.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
