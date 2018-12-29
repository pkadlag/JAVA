package com.television;
import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionVolumeTest {

	@Test
	public void testForVolumeWhenStateIsOff() {
		Television television = new Television();
		boolean st = television.setState(false);
		int expectedVolume = television.changeVolume(2);
		int actualVolume = television.getVolume();
		assertEquals(expectedVolume, actualVolume);
		// System.out.println("volume: "+television.getVolume());
	}

	@Test
	public void testForChangeVolumeWhenStateIsOn() {
		Television television = new Television();
		boolean st = television.setState(true);
		int expectedVolume = television.changeVolume(10);
		int actualVolume = television.getVolume();
		assertEquals(expectedVolume, actualVolume);
		// System.out.println("volume: "+television.getVolume());
	}

}
