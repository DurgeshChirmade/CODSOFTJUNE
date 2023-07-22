//7. Ignoring common words or stop words.

package com.codsoft.internship.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Seven{
    public static void main(String[] args) {
        String text = "Hello, World! This is CodSoft Internship an Java Developement.";

        // Split the string into an array of words using space or punctuation as delimiters
        String[] word = text.split("[\\s\\p{Punct}]+");

        // Set of common words or stop words to be ignored
        Set<String> stopWords = new HashSet<String>(Arrays.asList("is", "this", "an"));

        // Initialize a counter variable to keep track of the number of words
        int cnt = 0;

        // Iterate through the array of words and increment the counter for each non-stop word encountered
        for (String words : word) {
            if (!stopWords.contains(words.toLowerCase())) {
                cnt++;
            }
        }

        // Display the number of words (excluding stop words)
        System.out.println("Number of words (excluding stop words): " + cnt);
    }
}
