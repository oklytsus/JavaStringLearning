package org.softserve.academy;
/**
 *String to Integer with Default:
 * converts a string to an integer, returning a default value if the conversion fails.
 */
import java.util.Scanner;
    public class StringToInteger {
        public static void main(String[] args) {
            // Create a Scanner object to take user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string representing an integer
            System.out.print("Enter a string representing an integer: ");
            String inputString = scanner.nextLine();

            // Prompt the user to enter a default value if the conversion fails
            System.out.print("Enter a default value: ");
            int defaultValue = scanner.nextInt();

            // Convert the string to an integer with error handling
            int result = convertToInteger(inputString, defaultValue);

            // Display the result
            System.out.println("Converted Integer: " + result);

            // Close the scanner
            scanner.close();
        }

        // Method to convert a string to an integer with error handling
        private static int convertToInteger(String input, int defaultValue) {
            try {
                // Attempt to parse the string to an integer
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // If the conversion fails, return the default value
                System.out.println("Conversion failed. Using default value.");
                return defaultValue;
            }
        }
    }

