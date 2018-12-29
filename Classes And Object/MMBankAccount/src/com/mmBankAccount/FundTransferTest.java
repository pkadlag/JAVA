package com.mmBankAccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class FundTransferTest {

	@Test
	public void testForFundTransferIfAmountIsLessThanAccountBalance() {
		MMBankAccount punam = new MMBankAccount("Punam", 10000);
		MMBankAccount shital = new MMBankAccount("Shital", 8000);
		PaymentGateway.transfer(punam, shital, 3000);
		punam.withdraw(3000);
		assertEquals(4000, punam.getBalance(), 2);
	}

	@Test
	public void testForFundTransferIfAmountIsGreaterThanAccountBalance() {
		MMBankAccount punam = new MMBankAccount("Punam", 10000);
		MMBankAccount shital = new MMBankAccount("Shital", 8000);
		PaymentGateway.transfer(punam, shital, 11000);
		punam.withdraw(11000);
		assertEquals(10000, punam.getBalance(), 2);
	}

}
