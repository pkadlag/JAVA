package com.advancedInheritance.bankAccountAssignments;

public class MMSavingsAccount extends SavingsAccount {
	private static final double MINIMUMBALANCE = 0;

	public static double getMINIMUMBALANCE() {
		return MINIMUMBALANCE;

	}

	public MMSavingsAccount(String accountHolderName, double accountBalance,
			boolean isSalaried) {
		super(accountHolderName, accountBalance, isSalaried);
	}

	@Override
	public void withdraw(double amount) throws Exception {
		if (amount <= 0) {
			throw new InvalidInputException("Invalid input ");
		}

		else if (amount > accountBalance) {
			throw new InsufficientFundException("InsufficientFund");

		} else

			accountBalance -= amount;

	}

	@Override
	public String toString() {
		return "MMSavingsAccount [isSalaried()=" + isSalaried()
				+ ", toString()=" + super.toString()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}

}
