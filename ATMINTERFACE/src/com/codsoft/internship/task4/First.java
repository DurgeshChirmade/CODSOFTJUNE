//1.Create a class to represent 1. the ATM machine.

package com.codsoft.internship.task4;

import java.util.HashMap;
import java.util.Map;

class ATM
{
	private Map<String,Double> accountBalanceMap;

	public ATM()
	{
		accountBalanceMap = new HashMap<>();
	}

	public void addAccount(String accountNumber,double initialBalance)
	{
		accountBalanceMap.put(accountNumber,initialBalance);
	}

	public double checkBalance(String accountNumber)
	{
		if(accountBalanceMap.containsKey(accountNumber))
		{
			return accountBalanceMap.get(accountNumber);
		}
		else
		{
			System.out.println("Account Not Found !!!");
			return 0.0;
		}
	}

	public void deposit(String accountNumber,double amount)
	{
		if(accountBalanceMap.containsKey(accountNumber))
		{
			double currentBalance = accountBalanceMap.get(accountNumber);
			double newBalance = currentBalance + amount;
			accountBalanceMap.put(accountNumber,newBalance);
			System.out.println("Deposit Successful. New Balance : " + newBalance);
		}
		else
		{
			System.out.println("Account not found.");
		}
	}

	public void withdraw(String accountNumber,double amount)
	{
		if(accountBalanceMap.containsKey(accountNumber))
		{
			double currentBalance = accountBalanceMap.get(accountNumber);
			if(amount <= currentBalance)
			{
				double newBalance = currentBalance - amount;
				accountBalanceMap.put(accountNumber,newBalance);
				System.out.println("Withdrawl Successful. New Balance : " + newBalance);
			}
			else
			{
				System.out.println("Insufficient Funds.");
			}
		}
		else
		{
			System.out.println("Account Not Found.");
		}
	}

	public void displayAccounts()
	{
		System.out.println("Accounts in the ATM : ");
		for(Map.Entry<String,Double> entry : accountBalanceMap.entrySet())
		{
			System.out.println("Account Number : " + entry.getKey() + ", Balance : " + entry.getValue());
		}
	}
}

public class First
{
	public static void main(String args[])
	{
		ATM atm = new ATM();

		atm.addAccount("123456789",1000.0);
		atm.addAccount("987654321",500.0);

		atm.deposit("123456789",200.0);
		atm.withdraw("123456789",100.0);

		double balance = atm.checkBalance("123456789");
		System.out.println("Balance : " + balance);

		atm.displayAccounts();
	}
}