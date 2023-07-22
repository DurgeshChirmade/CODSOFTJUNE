//5.Connect the ATM class with the user's bank account class to access and modify the account balance.

package com.codsoft.internship.task4;


class ATMS
{
	private BankAccounts bankAccount;

	public ATMS()
	{
		bankAccount = new BankAccounts();
	}

	public void deposit(double amount)
	{
		bankAccount.deposit(amount);
	}

	public void withdraw(double amount)
	{
		bankAccount.withdraw(amount);
	}

	public void checkBalance()
	{
		double balance = bankAccount.getAccountBalance();
		System.out.println("Account Balance : " + balance);
	}
}

class BankAccounts
{
	private double accountBalance;

	public BankAccounts()
	{
		accountBalance = 0.0;
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
			System.out.println("Withdrawal Successful. New Balance is " + accountBalance);
		}
		else
		{
			System.out.println("Insufficient Funds...");
		}
	}
}

public class Five
{
	public static void main(String args[])
	{
		ATMS atm = new ATMS();

		atm.checkBalance();
		
		atm.deposit(600.0);
		atm.withdraw(300.0);

		atm.checkBalance();
	}
}