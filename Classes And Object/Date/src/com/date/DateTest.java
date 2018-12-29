package com.date;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTest {
	private Date testDate;

	@Before
	public void setUp() {
		testDate = new Date(20, 04, 1996);
	}

	@Test
	public void testForCheckInGivenFormatDate() {
		String answer = testDate.toString();
		assertEquals("20/4/1996", answer);
	}

	@Test
	public void testForCheckSmallerDate() {
		boolean answer = testDate.isSmaller(testDate);
		assertTrue(answer);

	}

	@Test
	public void testForDifferenceDate() {
		int expected[] = { 3, 1, 24 };
		assertArrayEquals(expected, testDate.difference(testDate));

	}

}
