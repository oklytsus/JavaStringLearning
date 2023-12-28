package org.softserve.academy;
/**
 * Compare Two Strings with Options: compares two strings input by the user,
 * providing options to ignore case differences and to consider white spaces.
 */

import java.util.Scanner;

public class CompareStrings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int result;
        System.out.println("Please input the first string:");
        String str1 = sc.nextLine();
        System.out.println("Please input the second string:");
        String str2 = sc.nextLine();
        System.out.println("Do you like to ignore cases? yes/no:");
        String ignoreCases = sc.nextLine();
        System.out.println("Do you like to consider whitespaces? yes/no:");
        String ignoreWhiteSpaces = sc.nextLine();
        if (ignoreWhiteSpaces.equalsIgnoreCase("no")) {
            str1 = str1.replaceAll("\\s", "");
            str2 = str2.replaceAll("\\s", "");
        }
        if (ignoreCases.equalsIgnoreCase("yes"))
            result = str1.compareToIgnoreCase(str2);
        else result = str1.compareTo(str2);

        if (result > 0) {
            System.out.println("\"" + str1 + "\"" + " is grater than " + "\"" + str2 + "\"");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\"" + " is less than " + "\"" + str2 + "\"");
        } else
            System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
    }
}



