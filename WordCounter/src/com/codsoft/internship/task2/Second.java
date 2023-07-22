//2.Read the input text or file and store it in a string.

package com.codsoft.internship.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Second
{
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your choice '1' For text and '2' For provide file name : ");
		int choice = Integer.parseInt(br.readLine());

		String text;

		switch(choice)
		{
			case 1:
					System.out.print("Enter your text : ");
					text = br.readLine();
					System.out.println("Input : " + text);
					break;

			case 2:
					System.out.print("Enter the file name : ");
					String filepath = br.readLine();

					try
					{
						text = readdata(filepath);
						System.out.println("Input : " + text);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					break;

			default:
					System.out.println("Invalid Choice...");
					return;
		}

		
	}

	private static String readdata(String filepath) throws FileNotFoundException
	{
		File f = new File(filepath);
		StringBuilder s = new StringBuilder();
		Scanner sc = new Scanner(f);

		while(sc.hasNextLine())
		{
			s.append(sc.nextLine());
			s.append(System.lineSeparator());
		}

		sc.close();
		return s.toString();
	}
	
}