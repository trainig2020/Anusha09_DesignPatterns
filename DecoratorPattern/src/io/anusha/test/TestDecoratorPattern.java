package io.anusha.test;

import io.anusha.decorator.BasicCar;
import io.anusha.decorator.Car;
import io.anusha.decorator.LuxuryCar;
import io.anusha.decorator.SportsCar;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}