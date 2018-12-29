package com.advancedInheritance.bankAccountAssignments;

/*Design a simple framework for Bank Application to represent Saving Accounts and Current Accounts.
 Use the framework to design application for MoneyMoney Bank. 
 */

public abstract class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;
	private static int accountId = 0;

	public BankAccount(String accountHolderName, double accountBalance) {
		super();

		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	{
		accountNumber = ++accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public abstract void withdraw(double amount) throws Exception;

	public void depoiste(double amount) throws Exception {
		if (amount <= 0) {
			throw new InvalidInputException("Invalid Input");
		} else
			accountBalance += amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}

}
