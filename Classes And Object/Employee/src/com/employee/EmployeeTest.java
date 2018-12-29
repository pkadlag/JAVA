package com.employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee employee;

	@Before
	public void setUp() {
		employee = new Employee(1, "Punam", 10000);
		employee.setPfRate(10);
	}

	@Test
	public void testForAnnualBasic() {
		double annualBasic = employee.annualBasic();
		assertEquals(120000, annualBasic, 2);
	}

	@Test
	public void testForAnnualGrossSalary() {
		double annualGrossSalary = employee.annualGrossSalary();
		assertEquals(204600, annualGrossSalary, 2);
	}

	@Test
	public void testForMonthlyTakeHome() {
		double monthlyTakeHome = employee.monthlyTakeHome();
		assertEquals(10450, monthlyTakeHome, 2);
	}

}
