package com.country;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountryTest {

	@Test
	public void testForFindingLargestPopulation() {
		Country countries[] = { new Country("India", 1000000, 5000),
				new Country("Germany", 800000, 3000),
				new Country("Italy", 300000, 1000) };
		int maximumPopulation = 0;
		for (int counter = 0; counter < countries.length; counter++) {
			if (maximumPopulation < countries[counter].getPopulation()) {
				maximumPopulation = countries[counter].getPopulation();
			}
		}
		assertEquals(1000000, maximumPopulation);
	}

	@Test
	public void testForFindingLargestAreas() {
		Country countries[] = { new Country("India", 1000000, 5000),
				new Country("Germany", 800000, 3000),
				new Country("Italy", 300000, 1000) };
		int maximumArea = 0;
		for (int counter = 0; counter < countries.length; counter++) {
			if (maximumArea < countries[counter].getArea()) {
				maximumArea = countries[counter].getArea();
			}
		}
		assertEquals(5000, maximumArea);
	}

	@Test
	public void testForMaximumPopulationDensity() {
		Country countries[] = { new Country("India", 1000000, 5000),
				new Country("Germany", 800000, 3000),
				new Country("Italy", 300000, 1000) };
		int maximumPopulationDensity = 0;
		for (int counter = 0; counter < countries.length; counter++) {
			if (maximumPopulationDensity < (countries[counter].getPopulation() / countries[counter]
					.getArea()))
				;
			{
				maximumPopulationDensity = (countries[counter].getPopulation() / countries[counter]
						.getArea());
			}
		}
		assertEquals(300, maximumPopulationDensity);
	}

}
