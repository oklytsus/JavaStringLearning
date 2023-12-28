package org.softserve.academy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Count Occurrences of Each Character:
 * counts the number of times each character is repeated in a string.
 */
public class CharacterCount {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the method to count character occurrences
        Map<Character, Integer> charCountMap = countCharacters(inputString);

        // Display the result
        System.out.println("Character Counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " times");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to count the occurrences of each character in a string
    private static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Update the count in the map
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}