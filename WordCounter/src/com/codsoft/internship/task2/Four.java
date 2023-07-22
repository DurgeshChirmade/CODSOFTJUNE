//4. Initialize a counter variable to keep track of the number of words.

package com.codsoft.internship.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Four
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your String : ");
		String text = br.readLine();

		String word[] = text.split("[\\s\\p{Punct}]+");

		System.out.println(Arrays.toString(word));

		int cnt = word.length;

		System.out.println("Number of words : " + cnt);
	} 
}
