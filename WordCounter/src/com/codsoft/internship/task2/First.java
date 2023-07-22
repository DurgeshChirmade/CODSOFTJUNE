//1.Prompt the user to enter a text or provide a file to count the words.

package com.codsoft.internship.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class First
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
					System.out.print("Enter the text : ");
					text = br.readLine();

					//Count words in the text
					int wordcount = Countwords(text);
					System.out.println("Word Count : " + wordcount);
					break;

			case 2:
					System.out.print("Enter the file name : ");
					String filepath = br.readLine();
					
					try
					{
						int wordscount = Countwordsfile(filepath);
						System.out.println("Word Count : " + wordscount);
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

	
	// Method to count words in a given text
	private static int Countwords(String text)
	{
		String words[] = text.split("\\s+");
		return words.length;
	}

	// Method to count words in a given file
	private static int Countwordsfile(String filepath) throws FileNotFoundException
	{
		File f = new File(filepath);

		Scanner filescan = new Scanner(f);

		int wordcount = 0;
		while(filescan.hasNext())
		{
			String line = filescan.nextLine();
			wordcount += Countwords(line);
		}

		filescan.close();

		return wordcount;


	}
}
