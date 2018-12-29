package com.mmBankAccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class SavingsAccountTest {

	@Test
	public void testForWithdrawMethodWhenAmountLessThanAccountBalance() {
		MMBankAccount bankAccount = new MMBankAccount("Punam", 10000);
		double actual = bankAccount.withdraw(5000);
		double expected = 5000;
		assertEquals(expected, actual, 0.0);
		System.out.println(bankAccount.toString());
	}

	@Test
	public void testForWithdrawMethodWhenAmountGreaterThanAccountBalance() {
		MMBankAccount bankAccount = new MMBankAccount("Punam", 10000);
		double actual = bankAccount.withdraw(15000);
		double expected = 10000;
		assertEquals(expected, actual, 0.0);
		System.out.println(bankAccount.toString());
	}

	@Test
	public void testForDepositeMethodWhenAmountGreaterThanZero() {
		MMBankAccount bankAccount = new MMBankAccount("Papa", 10000);
		double actual = bankAccount.withdraw(500);
		double expected = 15000;
		assertEquals(expected, actual, 0.0);
		System.out.println(bankAccount.toString());
	}

	@Test
	public void testForDepositeMethodWhenAmountLessThanZero() {
		MMBankAccount bankAccount = new MMBankAccount("Papa", 10000);
		double actual = bankAccount.withdraw(-500);
		double expected = 15000;
		assertEquals(expected, actual, 0.0);
		System.out.println(bankAccount.toString());
	}

}
