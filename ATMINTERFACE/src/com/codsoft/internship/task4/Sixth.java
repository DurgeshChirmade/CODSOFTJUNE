//6.Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).

package com.codsoft.internship.task4;

public class Sixth
{
	public static void main(String args[])
	{
		ATMS atm = new ATMS();

		atm.checkBalance();

		atm.deposit(700.0);
		atm.withdraw(300.0);

		atm.checkBalance();

		atm.withdraw(800.0);
		atm.deposit(-200.0);

		atm.checkBalance();

	}
}