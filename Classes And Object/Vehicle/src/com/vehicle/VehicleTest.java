package com.vehicle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testHighestIdentificationNumber() {
		Vehicle vehicle1 = new Vehicle("Punam");
		Vehicle vehicle2 = new Vehicle("Aboli");
		Vehicle vehicle3 = new Vehicle("Megha");
		Vehicle vehicle4 = new Vehicle("Praji");
		Vehicle vehicle5 = new Vehicle("Minal");
		Vehicle vehicle6 = new Vehicle("Akshay");
		Vehicle vehicle7 = new Vehicle();
		int actual = vehicle6.getHighestIdentificationNumber();
		assertEquals(7, actual);

	}

}
