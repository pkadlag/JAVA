package com.date;

/*Complete the implementation of the given Date class and test it by writing TestCases using JUnit:-



 class Date { 
 private int d, m, y; // data members to store the day, month and year of a date.
 public Date(int d, int m, int y) //constructor to initialize Date objects
 {
 //initialize d, m, y of the current object using the d, m, y parameters. 
 }
 public String toString()// method to get the value of a Date object printed
 {
 //return the value of a Date object as a String in d/m/y format.
 }
 public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
 {
 //If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
 }
 public int[] diff(Date d) //method to find out the difference of days, months and years in two dates.
 {
 //The difference of days, months and years in the invoking and parameter Date objects 
 //is obtained and returned in an int array. The first element of the array should represent
 //difference of days; second one, the difference of months and the third one, the difference of years.
 }
 }*/

public class Date {
	private int date;
	private int month;
	private int year; // data members to store the day, month and year of a
						// date.

	public Date(int date, int month, int year) // constructor to initialize Date
												// objects
	{
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public String toString()// method to get the value of a Date object printed
	{
		return date + "/" + month + "/" + year;
		// return the value of a Date object as a String in d/m/y format.
	}

	public boolean isSmaller(Date date)// method to check whether a date is
										// smaller than the other
	{
		Date givenDate = new Date(23, 03, 2020);
		if (date.date < givenDate.date) {
			return true;// If the value of invoking Date object is smaller than
						// the given object, true is returned otherwise false is
						// returned.

		} else
			return false;
	}

	public int[] difference(Date date) // method to find out the difference of
										// days, months and years in two dates.
	{
		/*
		 * The difference of days, months and years in the invoking and
		 * parameter Date objects is obtained and returned in an int array. The
		 * first element of the array should represent difference of days;
		 * second one, the difference of months and the third one, the
		 * difference of years.
		 */

		Date givenDate = new Date(23, 05, 2020);
		int newDate = givenDate.date - date.date;
		int newMonth = givenDate.month - date.month;
		int newYear = givenDate.year - date.year;
		int difference[] = { newDate, newMonth, newYear };
		return difference;

	}
}
