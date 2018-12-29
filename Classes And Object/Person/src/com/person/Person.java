package com.person;

/*Complete the implementation of the given class:-


 class Person
 { 
 private String name; // data member to store the name of a person.
 private Date dob; // data member to store the date of birth of a person.
 public Person(String n, int d, int m, int y) //constructor to initialize Person objects
 {
 //initialize the data members of the current Person object using the parameters. 
 }
 public void display()// method to display the details of a person.
 {
 //Person details should be displayed in the following format:
 //Name: Person Name
 //Date Of Birth: dd/mm/yyyy
 //Age: ... Years, ... Months, ... Days
 }
 public void olderOne(Person p) //method to identify the older of the two persons.
 {
 //Older one of the invoking and given person object is identified and its details are 
 //displayed in the following format:
 //.... is older than .... by ... years, ... months and ... days.
 }
 }*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String name; // data member to store the name of a person.
	private String dateOfBirth; // data member to store the date of birth of a
								// person.
	private int date;
	private int month;
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Person(String name, int date, int month, int year) // constructor to
																// initialize
																// Person
																// objects
	{
		this.name = name;// initialize the data members of the current Person
							// object using the parameters.
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public Person() {
	}

	public void display()// method to display the details of a person.
	{
		/*
		 * Person details should be displayed in the following format: Name:
		 * Person Name Date Of Birth: dd/mm/yyyy Age: ... Years, ... Months, ...
		 * Days
		 */

		LocalDate personDateOfBirth = LocalDate.of(1991, 10, 15);
		LocalDate currentDate = LocalDate.now();
		Period p = Period.between(personDateOfBirth, currentDate);
		String name = getName();
		String dateOfBirth = date + "/" + month + "/" + year;
		String age = p.getDays() + " Years " + p.getMonths() + " Months "
				+ p.getYears() + " Days ";

	}

	public String olderOne(Person person1, Person person2) // method to identify
															// the older of the
															// two persons.
	{
		/*
		 * Older one of the invoking and given person object is identified and
		 * its details are displayed in the following format: .... is older than
		 * .... by ... years, ... months and ... days.
		 */

		LocalDate person1DateOfBirth = LocalDate.of(person1.year,
				person1.month, person1.date);
		LocalDate person2DateOfBirth = LocalDate.of(person2.year,
				person2.month, person2.date);
		Period p = Period.between(person1DateOfBirth, person2DateOfBirth);
		if (p.getDays() > 0 && p.getMonths() > 0 && p.getYears() > 0) {

			return person1.name + " is older than " + person2.name + " by "
					+ p.getYears() + " years ," + p.getMonths()
					+ " months, and " + p.getDays() + " Days ";
		} else {
			return person2.name + " is older than " + person1.name + " by "
					+ p.getYears() + " years ," + p.getMonths()
					+ " months, and " + p.getDays() + " Days ";
		}

	}

}
