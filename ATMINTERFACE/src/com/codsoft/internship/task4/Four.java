//4.Create a class to represent the user's bank account, which stores the account balance.

package com.codsoft.internship.task4;

class BankAccount
{
	private double accountBalance;

	public BankAccount()
	{
		accountBalance = 0.0;
	}

	public BankAccount(double initialBalance)
	{
		accountBalance = initialBalance;
	}

	public double getAccountBalance()
	{
		return accountBalance;
	}

	public void deposit(double amount)
	{
		accountBalance += amount;
		System.out.println("Deposit Successful. New Balance is " + accountBalance);
	}

	public void withdraw(double amount)
	{
		if(amount <= accountBalance)
		{
			accountBalance -= amount;
			System.out.println("Withdrawl successful. New Balance is " + accountBalance);
		}
		else
		{
			System.out.println("Insufficient Funds...");
		}
	}
}

public class Four
{
	public static void main(String args[])
	{
		BankAccount account = new BankAccount(1000.0);

		System.out.println("Account Balance : " + account.getAccountBalance());
	
		account.deposit(300.0);
		account.withdraw(150.0);
		account.withdraw(1500.0);

		System.out.println("Account Balance : " + account.getAccountBalance());
	}

}