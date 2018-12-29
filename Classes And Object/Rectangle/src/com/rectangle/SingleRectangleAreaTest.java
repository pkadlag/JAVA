package com.rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleRectangleAreaTest {

	@Test
	public void testForBothPositiveLengthAndBreadth() {
		RectangleArea rectangleArea = new RectangleArea(50, 50);
		int answer = rectangleArea.areaOfRectangle();
		assertEquals(2500, answer);
	}

	@Test
	public void testForBothNegativeLengthAndBreadth() {
		RectangleArea rectangleArea = new RectangleArea(-50, -40);
		int answer = rectangleArea.areaOfRectangle();
		assertEquals(0, answer);

	}

	@Test
	public void testForPositiveLengthAndNegativeBreadth() {
		RectangleArea rectangleArea = new RectangleArea(+50, -40);
		int answer = rectangleArea.areaOfRectangle();
		assertEquals(0, answer);

	}

	@Test
	public void testForNegativeLengthAndPositiveBreadth() {
		RectangleArea rectangleArea = new RectangleArea(50, -40);
		int answer = rectangleArea.areaOfRectangle();
		assertEquals(0, answer);

	}
}
