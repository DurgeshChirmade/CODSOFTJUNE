//7. Display the user's score, which can be based on the number of attempts taken or rounds won.

package com.codsoft.internship.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Seventh {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the minimum value : ");
		int min = Integer.parseInt(br.readLine());

		System.out.print("Enter the maximum value : ");
		int max = Integer.parseInt(br.readLine());

		// Initialize variables for score tracking
		int totalScore = 0;
		int roundsWon = 0;

		// Create an instance of the Random class
		Random r = new Random();

		while (true) {
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
					roundsWon++;
					totalScore += (maxattempt - attempt + 1);
					break;
				} else if (guess < randomNum) {
					System.out.println("Too Low! The generated number is higher.");
				} else {
					System.out.println("Too High! The generated number is lower.");
				}

				if (attempt == maxattempt) {
					System.out.println("You have used all your attempts. The correct number was " + randomNum + ".");
				}
			}

			// Prompt the user to play again
			System.out.println("Do you want to play again? (Y/N)");
			String playAgain = br.readLine();

			// Check if the user wants to play again
			if (!playAgain.equalsIgnoreCase("Y")) {
				break; // Exit the game loop if the user does not want to play again.
			}
		}

		// Display the user score
		System.out.println("Rounds Won : " + roundsWon);
		System.out.println("Total Score : " + totalScore);

		System.out.println("Thank you for playing the guessing game. Goodbye!");
	}
}