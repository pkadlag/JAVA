package com.rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanlgeAreaTest {
	@Test
	public void testforareaoftworectangleofsameproperty() {
		RectangleArea rectangleArea1 = new RectangleArea(20, 10);
		RectangleArea rectangleArea2 = new RectangleArea(10, 20);
		int i = rectangleArea1.areaOfRectangle();
		int j = rectangleArea2.areaOfRectangle();
		assertEquals(i, j);
	}

	@Test
	public void testforareaoftworectangleofdifferentproperty() {
		RectangleArea rectangleArea1 = new RectangleArea(220, 10);
		RectangleArea rectangleArea2 = new RectangleArea(10, 20);
		int i = rectangleArea1.areaOfRectangle();
		int j = rectangleArea2.areaOfRectangle();
		assertFalse(i == j);
	}
}
