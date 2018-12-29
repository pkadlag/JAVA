package com.distance;

/*Write the definition for a class called Distance that has properties feet as integer  and inches as float. The class has the following behaviours/services/methods:
 void set(int, float) to give value to object
 void disp() to display distance in feet and inches
 Distance add(Distance) to sum two distances & return distance
 1. Write the definitions for each of the above member functions.
 2. Write DistanceTest class with main function to create three Distance objects. Set the value in two objects and call add() to calculate sum and assign it in third object. Display all distances.*/

public class Distance {
	private int feet;
	private float inches;

	public void set(int feet, float inches) // to give value to object
	{
		this.feet = feet;
		this.inches = inches;
	}

	public Distance addDistances(Distance object1, Distance object2) // to sum
																		// two
																		// distances
																		// &
																		// return
																		// distance
	{
		this.feet = object1.feet + object2.feet;
		this.inches = object1.inches + object2.inches;
		return this;
	}

	public float getFeet() {
		return this.feet;

	}

	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inches=" + inches + "]";
	}

	public float getInches() {

		return this.inches;
	}
}
