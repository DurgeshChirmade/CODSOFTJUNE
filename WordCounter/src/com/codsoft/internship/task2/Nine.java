// 9. Implementing input validation to handle empty inputs or file errors.

package com.codsoft.internship.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Nine
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your choice '1' for text and '2' for provide file name : ");
		int choice = Integer.parseInt(br.readLine());

		switch(choice)
		{
			case 1:
					System.out.print("Enter your text : ");

					String text = br.readLine();

					if(text.isEmpty())
					{
						System.out.println("Text input is empty. Please try again.");
						return;
					}

					// Calculate and display the word count
					int wordCount = countWords(text);
					System.out.println("Word Count : " + wordCount);
					break;

			case 2:
					System.out.print("Enter the file path : ");
					String filePath = br.readLine();

					try
					{
						String fc = readFile(filePath);

						if(fc.isEmpty())
						{
							System.out.println("File is empty.");
							return;
						}

						System.out.println("File Content : " + fc);

						int wc = countWords(fc);
						System.out.println("Word Count : " + wc);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					break;

			default :
					System.out.println("Invalid input method. Please try again.");
					return;

		}
	}

	// Method to count the words in a text
	private static int countWords(String text)
	{
		String words[] = text.split("\\s+");
		return words.length;
	}

	// Method to read a file 
	private static String readFile(String filePath) throws FileNotFoundException
	{
		File f = new File(filePath);
		Scanner sc = new Scanner(f);
		StringBuilder c = new StringBuilder();

		while (sc.hasNextLine())
		{
			c.append(sc.nextLine());
			c.append(System.lineSeparator());
		}

		sc.close();
		return c.toString();
	}
}
