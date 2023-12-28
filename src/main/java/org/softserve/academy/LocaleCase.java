package org.softserve.academy;
import java.util.Locale;
import java.util.Scanner;

/**
 * Case Conversion with Locale:
 * converts all the characters in a string to lowercase using a locale specified by the user.
 */
public class LocaleCase {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter a locale
        System.out.print("Enter a locale (e.g., en_US): ");
        String localeString = scanner.nextLine();

        // Parse the user-provided locale string
        Locale locale = new Locale(localeString);

        // Convert the string to lowercase using the specified locale
        String result = inputString.toLowerCase(locale);

        // Display the result
        System.out.println("Original String: " + inputString);
        System.out.println("Converted to Lowercase: " + result);

        // Close the scanner
        scanner.close();
    }
}