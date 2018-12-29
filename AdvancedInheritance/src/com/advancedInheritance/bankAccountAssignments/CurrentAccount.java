package com.advancedInheritance.bankAccountAssignments;

public abstract class CurrentAccount extends BankAccount {
	protected final double creditLimit;

	public double getCreditLimit() {
		return creditLimit;
	}

	public CurrentAccount(String accountHolderName, double accountBalance,
			double creditLimit) {
		super(accountHolderName, accountBalance);
		this.creditLimit = creditLimit; // lazy initialization
	}

	//@Override
	public abstract void withdraw(double amount) throws Exception;

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}

}
