package org.softserve.academy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Anagram Checker
 * Write a Java program to check if two strings are anagrams of each other, considering case sensitivity based on user input.
 * An anagram of a string is another string that contains the same characters, only the order of characters can be different.
 * For example, “abcd” and “dabc” are an anagram of each other.
 */
public class Anagram {

    // Function to check if two strings are anagrams
    static boolean areAnagrams(String str1, String str2) {
        // Check if both strings have the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Ask the user whether to consider case sensitivity
        System.out.print("Consider case sensitivity? (yes/no): ");
        String caseSensitiveInput = scanner.nextLine();
        boolean caseSensitive = caseSensitiveInput.equalsIgnoreCase("yes");

        // Check if the strings are anagrams considering case sensitivity
        if (caseSensitive) {
            if (areAnagrams(str1, str2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        } else {
            // Convert strings to lowercase before checking for anagrams
            if (areAnagrams(str1.toLowerCase(), str2.toLowerCase())) {
                System.out.println("The strings are anagrams (case-insensitive).");
            } else {
                System.out.println("The strings are not anagrams (case-insensitive).");
            }
        }

        scanner.close();
    }
}
