package com.mmBankAccount;

public class PaymentGateway {
	public static boolean transfer(MMBankAccount sender,
			MMBankAccount receiver, double amount) {
		if (sender.getBalance() >= amount) {
			sender.withdraw(amount);
			receiver.deposite(amount);
			return true;
		} else
			return false;
	}
}
