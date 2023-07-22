//7. Display appropriate messages to the user based on their chosen options and the success or failure of their transactions.

package com.codsoft.internship.task4;

class ATMES
{
	private Bankaccountes bankaccount;

	public ATMES()
	{
		bankaccount = new Bankaccountes();
	}

	public void deposit(double amount)
	{
		if(amount > 0)
		{
			bankaccount.deposit(amount);
		}
		else
		{
			System.out.println("Invalid Deposit Amount. Amount must be greater than 0.");
		}
	}

	public void withdraw(double amount)
	{
		if(amount > 0)
		{
			double balance = bankaccount.getAccountBalance();
			if(amount <= balance)
			{
				bankaccount.withdraw(amount);
			}
			else
			{
				System.out.println("Insufficient Funds. Current Balance is " + balance);
			}
		}
		else
		{
			System.out.println("Invalid Withdrawal Amount. Amount must be greater than 0.");
		}
	}

	public void checkBalance()
	{
		double balance = bankaccount.getAccountBalance();
		System.out.println("Account Balance : " + balance);
	}
}

class Bankaccountes
{
	private double accountBalance;

	public Bankaccountes()
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

public class Seven
{
	public static void main(String args[])
	{
		ATMES atm = new ATMES();

		atm.checkBalance();

		atm.deposit(700.0);
		atm.withdraw(300.0);

		atm.checkBalance();

		atm.withdraw(800.0);
		atm.deposit(-200.0);

		atm.checkBalance();

	}
}