//3. Split the string into an array of words using space or punctuation as delimiters.

package com.codsoft.internship.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Third
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your String : ");
		String text = br.readLine();

		String word[] = text.split("[\\s\\p{Punct}]+");

		System.out.println(Arrays.toString(word));
	} 
}
