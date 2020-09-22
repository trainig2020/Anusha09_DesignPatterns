package io.anusha.test;

import io.anusha.model.Computer;

public class ComputerClient {

	public static void main(String[] args) {

		Computer comp = new Computer.Builder("2GB", "27B", "Intel i7").build();

		Computer comp1 = new Computer.Builder("2GB", "27B", "Intel i7")
				.setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();

	}

}
