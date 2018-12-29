package com.advancedInheritance.bankAccountAssignments;

public abstract class SavingsAccount extends BankAccount {

	private boolean isSalaried;
	private static final double MINIMUMBALANCE = 1000.00;

	public SavingsAccount(String accountHolderName, double accountBalance,
			boolean isSalaried) {
		super(accountHolderName, accountBalance);
		this.isSalaried = isSalaried;

	}

	public boolean isSalaried() {
		return isSalaried();
	}

	public static double getMINIMUMBALANCE() {
		return MINIMUMBALANCE;
	}

	@Override
	public String toString() {
		return "SavingsAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public abstract void withdraw(double amount) throws Exception;

}
