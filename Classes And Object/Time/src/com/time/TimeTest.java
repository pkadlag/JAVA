package com.time;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {
	private Time time1;
	private Time time2;
	private Time time3;

	@Before
	public void setUp() {
		time1 = new Time();
		time2 = new Time();
		time3 = new Time();
	}

	@Test
	public void testForSumOfHours() {
		time1.set(5, 30);
		time2.set(7, 40);
		time3.sum(time1, time2);
		assertEquals(13, time3.getHour(), 0);
		assertEquals(10, time3.getMinute(), 0);
		time3.toString();
	}

	@Test
	public void testForSumOfMinutes() {
		time1.set(5, 70);
		time2.set(7, 20);
		time3.sum(time1, time2);
		assertEquals(30, time3.getMinute(), 0);
		time3.toString();
	}

	@Test
	public void testForDisplayTime() {
		time1.set(5, 30);
		time2.set(7, 40);
		time3.sum(time1, time2);
		String string1 = time3.toString();
		String string2 = "Time [hours=13, minutes=10]";
		assertEquals(string2, string1);

	}

}
