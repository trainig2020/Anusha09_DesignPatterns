package io.anusha.test;

import io.anusha.model.SocketAdaptor;
import io.anusha.model.SocketAdaptorClassImpl;
import io.anusha.model.SocketAdaptorObjectImpl;
import io.anusha.model.Volt;

public class TestAdapotorPattern {

	public static void main(String[] args) {

		testClassAdapter();
		testObjectAdapter();

	}

	private static void testObjectAdapter() {

		SocketAdaptor sockAdapter = new SocketAdaptorObjectImpl();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
		System.out
				.println("v120 volts using Object Adapter=" + v120.getVolts());

	}

	private static void testClassAdapter() {
		SocketAdaptor sockAdapter = new SocketAdaptorClassImpl();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolts());

	}

	private static Volt getVolt(SocketAdaptor sockAdapter, int i) {
		switch (i) {
		case 3:
			return sockAdapter.get3Volt();
		case 12:
			return sockAdapter.get12Volt();
		case 120:
			return sockAdapter.get120Volt();
		default:
			return sockAdapter.get120Volt();
		}
	}
}
