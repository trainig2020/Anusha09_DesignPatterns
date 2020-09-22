package io.anusha.test;

import io.anusha.abstractfactory.PcFactory;
import io.anusha.abstractfactory.ServerFactory;
import io.anusha.model.Computer;




public class TestAbstractFactory {
	
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = io.anusha.abstractfactory.ComputerFactory.getComputer(new PcFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = io.anusha.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config: " +pc);
		System.out.println("AbstractFactory Server Config: " +server);
	}

}
