//3.Implement methods for each option, such as withdraw(amount), deposit(amount), and checkBalance().

package com.codsoft.internship.task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Third
{
	private static ATM atm = new ATM();

	public static void main(String args[]) throws Exception
	{

		atm.addAccount("123456789",1000.0);
		atm.addAccount("987654321",500.0);

		displayMenu();

		int choice = getChoice();
		processChoice(choice);
	}

	private static void displayMenu()
	{
		System.out.println("---------- ATM MACHINE ----------");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");

		System.out.print("Enter your choice : ");
	}

	private static int getChoice() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int choice = Integer.parseInt(br.readLine());
		return choice;
	}

	private static void processChoice(int choice) throws Exception
	{
		switch(choice)
		{
			case 1:
					checkBalance();
					break;

			case 2:
					deposit();
					break;

			case 3:
					withdraw();
					break;

			case 4:
					System.out.println("Thank you for using the ATM. Goodbye!!!");
					break;

			default:
					System.out.println("Invalid Choice. Please try again.");
					processChoice(getChoice());
					break;
		}
	}

	private static void checkBalance() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter account number : ");
		String accountNumber = br.readLine();

		double balance = atm.checkBalance(accountNumber);
		System.out.println("Account Balance : " + balance);

		processChoice(getChoice());
	}

	private static void deposit() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter account number : ");
		String accountNumber = br.readLine();

		System.out.print("Enter deposit amount : ");
		double amount = Double.parseDouble(br.readLine());

		atm.deposit(accountNumber,amount);

		processChoice(getChoice());
	}

	private static void withdraw() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter account number : ");
		String accountNumber = br.readLine();

		System.out.print("Enter withdrawal amount : ");
		double amount = Double.parseDouble(br.readLine());

		atm.withdraw(accountNumber,amount);

		processChoice(getChoice());
	}
}