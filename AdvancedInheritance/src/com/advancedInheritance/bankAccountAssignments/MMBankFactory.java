package com.advancedInheritance.bankAccountAssignments;

public class MMBankFactory extends BankFactory {

	@Override
	public MMSavingsAccount getNewSavingAccount(String accountHolderName,
			double accountBalance, boolean isSalaried) {

		return new MMSavingsAccount(accountHolderName, accountBalance,
				isSalaried);
	}

	@Override
	public MMCurrentAccount getNewCurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit) {

		return new MMCurrentAccount(accountHolderName, accountBalance,
				creditLimit);
	}

}
