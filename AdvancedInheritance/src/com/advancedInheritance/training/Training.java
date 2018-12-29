package com.advancedInheritance.training;

public abstract class Training {

	private int id;
	private String subject;
	private double fees;
	private static int idGenerator;

	static {
		idGenerator = 1000;
	}
	{
		id = ++idGenerator;
	}

	public Training(String subject, double fees) {

		this.subject = subject;
		this.fees = fees;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public abstract double getOrderValue();
}
