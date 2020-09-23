package io.anusha.template.test;

import io.anusha.template.GlassHouse;
import io.anusha.template.HouseTemplate;
import io.anusha.template.WoodenHouse;

public class HousingClient {

	public static void main(String[] args) {

		HouseTemplate houseType = new WoodenHouse();

		// using template method
		houseType.buildHouse();
		System.out.println("************");

		houseType = new GlassHouse();

		houseType.buildHouse();
	}

}
