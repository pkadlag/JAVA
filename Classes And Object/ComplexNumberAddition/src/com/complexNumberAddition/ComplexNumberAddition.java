package com.complexNumberAddition;

/*Write the definition for a class called Complex that has floating point properties for storing real and imaginary parts. The class has the following behaviours/services/methods:
 void set(float, float) to set the specified value in object
 void disp() to display complex number object
 complex sum() to sum two complex numbers & return complex number
 1. Write the definitions for each of the above member functions.
 2. Write a ComplexTest class with main function to create three complex number objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all complex numbers.*/

public class ComplexNumberAddition {
	private float real;
	private float imaginary;

	void set(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public String display() {

		String display = "Complex Number is=" + this.real + "+"
				+ this.imaginary + "i";
		return display;
	}

	public float getReal() {
		return this.real;
	}

	public float getImaginary() {
		return this.imaginary;
	}

	public ComplexNumberAddition additionOfComplexNumber(
			ComplexNumberAddition object1, ComplexNumberAddition object2) {
		this.real = object1.real + object2.real;
		this.imaginary = object1.imaginary + object2.imaginary;
		return this;
	}
}