package com.rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerimterTest {

	@Test
	public void testForBothPositiveLengthAndBreadth() {
		RectangleArea rectanglearea = new RectangleArea(50, 50);
		int answer = rectanglearea.perimeterOfRectangle();
		assertEquals(200, answer);
	}

	@Test
	public void testForNegativeLengthAndNegativeBreadth() {
		RectangleArea rectangleArea = new RectangleArea(-50, -40);
		int answer = rectangleArea.perimeterOfRectangle();
		assertEquals(00, answer);

	}
}
