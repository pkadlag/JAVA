package com.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	private Person person1;
	private Person person2;

	@Before
	public void setUp() {
		person1 = new Person("Punam", 5, 8, 1970);
		person2 = new Person("Pooja", 15, 3, 1985);
	}

	@Test
	public void testToCheckOlderPerson() {

		String expected = "Punam is older than Pooja by 14 years ,7 months, and 10 Days ";
		String answer = person1.olderOne(person1, person2);
		assertEquals(expected, answer);
	}

}
