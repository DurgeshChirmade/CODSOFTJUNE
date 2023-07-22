//5. Limit the number of attempts the user has to guess the number.

package com.codsoft.internship.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Fifth {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the minimum value : ");
		int min = Integer.parseInt(br.readLine());

		System.out.print("Enter the maximum value : ");
		int max = Integer.parseInt(br.readLine());

		// Create an instance of the Random class
		Random r = new Random();

		// Generate a random number within the specified range
		int randomNum = r.nextInt((max - min) + 1) + min;

		// maximum number of attempts
		int maxattempt = 5;

		for (int attempt = 1; attempt <= maxattempt; attempt++) {
			System.out.print("Guess the random Number between" + min + " and " + max + " : ");
			int guess = Integer.parseInt(br.readLine());

			// Check if the user's guess is correct
			if (guess == randomNum) {
				System.out.println("Congratulations! Your guess is correct.");
			} else if (guess < randomNum) {
				System.out.println("Too Low! The generated number is higher.");
			} else {
				System.out.println("Too High! The generated number is lower.");
			}

			if (attempt == maxattempt) {
				System.out.println("You have used all your attempts. The correct number was " + randomNum + ".");
			}
		}
	}
}
