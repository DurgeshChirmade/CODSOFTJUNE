//5. Iterate through the array of words and increment the counter for each word encountered.

package com.codsoft.internship.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Five
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your String : ");
		String text = br.readLine();

		String word[] = text.split("[\\s\\p{Punct}]+");

		System.out.println(Arrays.toString(word));

		int cnt = 0;

		for(String words : word)
		{
			cnt++;
		}

		System.out.println("Number of words : " + cnt);
	} 
}
