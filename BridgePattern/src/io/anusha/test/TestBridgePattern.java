package io.anusha.test;

import io.anusha.model.GreenColor;
import io.anusha.model.Pentagon;
import io.anusha.model.Redcolor;
import io.anusha.model.Shape;
import io.anusha.model.Triangle;

public class TestBridgePattern {

	public static void main(String[] args) {

		Shape tri = new Triangle(new Redcolor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();

	}

}
