//1. Generate a random number within a specified range, such as 1 to 100.

package com.codsoft.internship.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class First {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the minimum range value : ");
		int min = Integer.parseInt(br.readLine());

		System.out.print("Enter the maximum range value : ");
		int max = Integer.parseInt(br.readLine());

		// Create an instance of the Random class
		Random r = new Random();

		// Generate a random number within the specified range
		int randomNum = r.nextInt((max - min) + 1) + min;

		System.out.println("Random Number between " + min + " and " + max + " is " + randomNum);

	}

}
