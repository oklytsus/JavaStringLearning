package org.softserve.academy;

import java.util.Scanner;

/**
 * String Length with Trim: gets the length of a given string, offering the user the option
 * to remove leading and trailing whitespace before calculating the length.
 */
public class StrLength {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input your string:");
        String str1 = sc.nextLine();
        System.out.println("Do you like to consider leading and trailing whitespaces? yes/no:");
        String ignoreWhiteSpaces = sc.nextLine();
        if (ignoreWhiteSpaces.equalsIgnoreCase("no")) {
            String trimmedString = str1.strip();
            System.out.println("The length of your string without leading and trailing whitespaces is: " + trimmedString.length());
        } else System.out.println("The length of your string is: " + str1.length());

    }
}
