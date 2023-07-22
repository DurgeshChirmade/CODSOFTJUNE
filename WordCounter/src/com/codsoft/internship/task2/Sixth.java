//6. Display the total count of words to the user.

package com.codsoft.internship.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sixth
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your String : ");
		String text = br.readLine();

		String word[] = text.split("[\\s\\p{Punct}]+");

		System.out.println(Arrays.toString(word));

		int cnt = word.length;

		System.out.println("Total count of words : " + cnt);
	} 
}
