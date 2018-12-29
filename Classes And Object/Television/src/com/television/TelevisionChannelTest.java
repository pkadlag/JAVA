package com.television;
import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionChannelTest {

	@Test
	public void testForGetChannelWhenStateIsOff() {
		Television television = new Television();
		boolean st = television.setState(false);
		int expectedChannelNumber = television.changeChannel(5);
		int actualChannelNumber = television.getCurrentChannel();
		assertEquals(expectedChannelNumber, actualChannelNumber);
		// System.out.println("ChannelNumber:" +television.getCurrentChannel());

	}

	@Test
	public void testForChangeChannelWhenStateIsOn() {
		Television television = new Television();
		boolean st = television.setState(true);
		int expectedChannelNumber = television.changeChannel(10);
		int actualChannelNumber = television.getCurrentChannel();
		assertEquals(expectedChannelNumber, actualChannelNumber);
		// System.out.println("ChannelNumber:" +television.getCurrentChannel());

	}
}
