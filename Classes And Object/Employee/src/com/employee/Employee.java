package com.employee;

/*Attributes:
 Id
 name
 monthlyBasic
 Behaviours/Interfaces/Services: 
 getAnnualBasic() //(return 12 * monthlyBasic;)
 getMonthlyGrossSalary()//(monthlyBasic + hra + medical + conveyance)
 getAnnualGrossSalary() //(12 * MonthlyGrossSalary)
 getMonthlyDeductions() //(pf + esic + profTax)
 getMonthlyTakeHome() //(MonthlyGrossSalary- MonthlyDeductions)
 getAnnualTakeHome() //(12 * MonthlyTakeHome)
 setPFRate(float f)  and getPFRate()


 HRA = 50% of basic, medical allowance = Rs 1250, conveyance allowance = Rs 800
 PF = 10% of  monthly basic or 6500 whichever is lower.
 ESIC = 4.75% of monthly basic if monthly basic <= 5000
 professional tax: if monthly gross <= 10000 then Rs 50, else Rs 100*/

import java.awt.geom.Arc2D.Float;

public class Employee {

	// properties
	private static int id;
	private String name;
	private double monthlyBasic;
	private static int PfRate;
	public static int highestId = 1;

	public Employee() {
		this.id = highestId++;
	}

	public Employee(int id, String name, double monthlyBasic) {
		this.id = highestId;
		this.name = name;
		this.monthlyBasic = monthlyBasic;

	}

	public static int getPfRate() {
		return PfRate;
	}

	public static void setPfRate(int pfRate) {
		Employee.PfRate = pfRate;
	}

	public double getPf() {
		double pf = (monthlyBasic * Employee.getPfRate()) / 100;
		if (pf <= 6500)
			pf = 6500;
		return pf;
	}

	public double getEsic() {
		double esic = 0;
		if (monthlyBasic <= 5000)
			esic = (monthlyBasic * 4.75) / 100;
		return esic;
	}

	public double getProfTax() {
		double profTax = 0;
		if (monthlyGrossSalary() <= 5000)
			profTax = 50;
		else
			profTax = 100;
		return profTax;

	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Employee.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

	public double annualBasic() {
		return 12 * monthlyBasic;

	}

	public double monthlyGrossSalary() {
		final double medical = 1250;
		final double conveyance = 800;
		double hra = (monthlyBasic * 50) / 100;
		double monthlyGrossSalary = monthlyBasic + hra + medical + conveyance;

		return monthlyGrossSalary;
	}

	public double annualGrossSalary() {
		double monthlyGrossSalary = 12 * monthlyGrossSalary();
		return monthlyGrossSalary;
	}

	public double monthlyDeductions() {
		double monthlyDeductions = getPf() + getEsic() + getProfTax(); // (calculatePF()+
																		// calculateESIC()+calculateSetProfTax());

		return monthlyDeductions;
	}

	public double monthlyTakeHome() // (MonthlyGrossSalary- MonthlyDeductions)
	{

		double monthlyTakeHome = monthlyGrossSalary() - monthlyDeductions();
		return monthlyTakeHome;
	}

	public double annualTakeHome() // (12 * MonthlyTakeHome)
	{
		double annualTakeHome = 12 * monthlyTakeHome();
		return annualTakeHome;

	}

}
