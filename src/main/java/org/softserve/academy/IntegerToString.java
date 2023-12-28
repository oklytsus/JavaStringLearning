package org.softserve.academy;
/**
 * Convert Integer to String with Formatting: converts an integer to a string,
 * formatting the output to a specific number of decimal places.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputInt = scanner.nextInt();
        System.out.print("Enter the number of decimal places: ");
        int decimalPlaces = scanner.nextInt();
        //String result = formatInteger(inputInt, decimalPlaces);
        String result = String.format("%." +decimalPlaces+"f", (double) inputInt);
        System.out.println("Formatted String: " + result);
        scanner.close();
    }
    static String formatInteger(int value, int decimalPlaces) {
        // Create a DecimalFormat object with the desired format
        String pattern = "0." + "0".repeat(decimalPlaces);
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        // Use the DecimalFormat object to format the integer as a string
        return decimalFormat.format(value);
    }
}