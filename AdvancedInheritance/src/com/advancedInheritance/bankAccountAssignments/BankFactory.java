package com.advancedInheritance.bankAccountAssignments;


public abstract class BankFactory {
	public abstract SavingsAccount getNewSavingAccount(
			String accountHolderName, double accountBalance, boolean isSalaried);

	public abstract CurrentAccount getNewCurrentAccount(
			String accountHolderName, double accountBalance, double creditLimit);

}
