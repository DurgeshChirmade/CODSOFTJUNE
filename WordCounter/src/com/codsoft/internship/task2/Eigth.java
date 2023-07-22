//8. Providing statistics like the number of unique words or the frequency of each word.

package com.codsoft.internship.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Eigth
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your String : ");
		String text = br.readLine();

		String word[] = text.split("[\\s\\p{Punct}]+");

		//Calculate the number of unique words
		int cnt = countUniqueWords(word);

		//Calculate the frequency of each word
		Map<String,Integer> wf = calculateWordFrequency(word);

		//Display the statistics
		System.out.println("Number of unique words : " + cnt);
		System.out.println("Word frequency : ");
		for(Map.Entry<String,Integer> entry : wf.entrySet())
		{
			System.out.print(entry.getKey() + " : " + entry.getValue() + " ");
		}

	}

	//Method to count the number of unique words
	private static int countUniqueWords(String word[])
	{
		Map<String,Integer> wc = new HashMap<>();

		for(String words : word)
		{
			wc.put(words.toLowerCase(),1);
		}
		return wc.size();
	}

	//Method to calculate the frequency of each word
	private static Map<String,Integer> calculateWordFrequency(String word[])
	{
		Map<String,Integer> wfc = new HashMap<>();

		for(String words : word)
		{
			String lw = words.toLowerCase();
			wfc.put(lw,wfc.getOrDefault(lw,0) + 1);
		}

		return wfc;
	}
}