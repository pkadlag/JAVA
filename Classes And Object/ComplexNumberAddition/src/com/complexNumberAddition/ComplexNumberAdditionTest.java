package com.complexNumberAddition;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComplexNumberAdditionTest {
	private ComplexNumberAddition complexnumberOne;
	private ComplexNumberAddition complexnumberTwo;
	private ComplexNumberAddition complexnumberThree;

	@Before
	public void setup() {
		complexnumberOne = new ComplexNumberAddition();
		complexnumberTwo = new ComplexNumberAddition();
		complexnumberThree = new ComplexNumberAddition();
	}

	private ComplexNumberAddition complexNumberAddition1;
	private ComplexNumberAddition complexNumberAddition2;
	private ComplexNumberAddition complexNumberAddition3;

	@Test
	public void testForPositiveRealNumbers() {
		complexnumberOne.set(10f, 20f);
		complexnumberTwo.set(20f, 30f);
		complexnumberThree.additionOfComplexNumber(complexnumberOne,
				complexnumberTwo);
		assertEquals(30, complexnumberThree.getReal(), 0);
		complexnumberThree.display();

	}

	@Test
	public void testForPositiveImaginaryNumbers() {
		complexnumberOne.set(-10f, 20f);
		complexnumberTwo.set(20f, 30f);
		complexnumberThree.additionOfComplexNumber(complexnumberOne,
				complexnumberTwo);
		assertEquals(50, complexnumberThree.getImaginary(), 0);
		complexnumberThree.display();
	}

	@Test
	public void testForOnePositiveAndOneNegativeRealNumber() {
		complexnumberOne.set(-10f, 20f);
		complexnumberTwo.set(36f, 30f);
		complexnumberThree.additionOfComplexNumber(complexnumberOne,
				complexnumberTwo);
		assertEquals(26, complexnumberThree.getReal(), 0);
		complexnumberThree.display();
	}

	@Test
	public void testForOnePositiveAndOneNegativeImaginaryNumber() {
		complexnumberOne.set(10f, -20f);
		complexnumberTwo.set(20f, 55f);
		complexnumberThree.additionOfComplexNumber(complexnumberOne,
				complexnumberTwo);
		assertEquals(35, complexnumberThree.getImaginary(), 0);
		complexnumberThree.display();
	}

	@Test
	public void testForDisplayNumbers() {
		complexnumberOne.set(10f, 20f);
		complexnumberTwo.set(20f, 30f);
		complexnumberThree.additionOfComplexNumber(complexnumberOne,
				complexnumberTwo);
		String string1 = complexnumberThree.display();
		String string2 = "Complex Number is=30.0+50.0i";
		assertEquals(string2, string1);
		// assertEquals(30,complexnumberThree.getReal(),0);
		// complexnumberThree.display();

	}
}
