package com.distance;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistanceTest {
	private Distance distance1;
	private Distance distance2;
	private Distance distance3;

	@Before
	public void setUp() {
		distance1 = new Distance();
		distance2 = new Distance();
		distance3 = new Distance();
	}

	@Test
	public void testForAdditionOfDistanceOfFeets() {
		distance1.set(1, 1.2f);
		distance2.set(2, 2.3f);
		distance3.addDistances(distance1, distance2);
		assertEquals(3, distance3.getFeet(), 0);
	}

	@Test
	public void testForAdditionOfDistanceOfInches() {
		distance1.set(1, 1.2f);
		distance2.set(2, 2.3f);
		distance3.addDistances(distance1, distance2);
		assertEquals(3.5f, distance3.getInches(), 0);
	}

	@Test
	public void testForDisplaysAddition() {
		distance1.set(4, 1.0f);
		distance2.set(2, 1.3f);
		distance3.addDistances(distance1, distance2);
		String string3 = distance3.toString();
		String string4 = "Distance [feet=6, inches=2.3]";
		assertEquals(string4, string3);
	}

}
