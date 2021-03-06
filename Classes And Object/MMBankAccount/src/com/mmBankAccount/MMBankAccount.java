package com.mmBankAccount;

/*Create a project for Money Money Bank. Money Money Bank is our banking client and they want us to create a solution for their business problem.

 MM bank deals with Savings Account, the expectation is, anyone can open savings account in MM bank by just giving their basic info like name, and initial balance. Every time the account object is created new account number is generated automatically and assigned to the accountNumber instance member, no two account object will have same account number.

 customers can also open account without balance, which is a Zero balance account.

 account has services like withdraw and deposit, anyone having an account object can use these services and on usage accordingly their accountBalance will change.

 On printing the reference of an account through S.O.P it should display the account details on the console.

 bank also provide a service, getNextAccountNumber() which is a kind of a open service that is open to all the people so, that even if a person does not have an account object he/she can still call this function to know what will be the next accountNumber if he/she opens an account in MM bank. So, even if their is no account object created yet, we should be able to call getNextAccountNumber().


 create multiple account objects and test if it works as per the expectation of our client.

 -------------------------------------------------------------------------------------------
 Hint for Generating unique account number:-
 1) use of static 
 2) use of Initializers(Self-Study)
 Study about initializers and implement it as per your understanding.
 ---------------------------------------------------------------------------------------------


 Also, Complete the Implementation of the given PaymentGateway class:-


 class PaymentGateway
 { 
 //method to transfer the given amount from the src to target account.
 public static boolean transfer(SavingsAccount sender, SavingsAccount reciever, double amount) 
 {
 //If the sender account balance = the given amount then the amount is transferred from the sender to the reciever account and true is returned
 //otherwise false is returned.
 }
 }






 ----------------------------------------
 BEST PRACTICE:-
 1) Naming Convention for classes, objects, instance member, methods and local variable must be followed properly.
 2) Comments are mandatory above every classes and every methods.
 3) Code must be properly Indented.
 4) Code must be properly grouped in together with related statements.
 5) reading and displaying of data should only be done in main method.
 6) Make sure you don't repeat any code statements in functions or constructors.
 7) write TestCases for withdraw, deposit and fundTransfer
 */

public class MMBankAccount {
	private String name;
	private double balance;
	private double accountNumber;
	private static double accountId;

	static {
		accountId = 123456;
	}
	{
		accountNumber = ++accountId;
	}

	public MMBankAccount(String name, double initialBalance) {
		super();
		this.name = name;
		this.balance = initialBalance;
	}

	public double withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			this.balance = this.balance;
		return this.balance;
	}

	public double deposite(double amount) {
		if (amount < 0) {
			balance += amount;
		} else
			this.balance = this.balance;
		return this.balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "MMBankAccount [name=" + name + ", balance=" + balance
				+ ", accountNumber=" + accountNumber + "]";
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	/*
	 * public void setAccountNumber(double accountNumber) { this.accountNumber =
	 * accountNumber; }
	 */

}
