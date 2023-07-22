//2.Prompt the user to enter their guess for the generated number.

package com.codsoft.internship.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Second {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the minimum value : ");
		int min = Integer.parseInt(br.readLine());

		System.out.print("Enter the maximum value : ");
		int max = Integer.parseInt(br.readLine());

		// Create an instance of the Random class
		Random r = new Random();

		// Generate a random number within the specified range
		int randomNum = r.nextInt((max - min) + 1) + min;

		System.out.print("Guess the random Number between" + min + " and " + max + " : ");
		int guess = Integer.parseInt(br.readLine());

		// Check if the user's guess is correct
		if (guess == randomNum) {
			System.out.println("Congratulations! Your guess is correct.");
		} else {
			System.out.println("Oops! Your guess is incorrect. The random number is: " + randomNum);
		}
	}
}
