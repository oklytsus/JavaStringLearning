package org.softserve.academy;

import java.util.Scanner;

/**
 * Merge Two Strings Alternately
 * Write a Java program that merges two strings, taking one character at a time alternately from each string.
 */
public class MergeAlternately {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        scanner.close();
        String strResult="";

        if (str1.length() >= str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (i < str2.length()) {
                    strResult += str1.charAt(i);
                    strResult += str2.charAt(i);
                } else {
                    strResult += str1.charAt(i);
                }
            }
        } else {
            for (int i = 0; i < str2.length(); i++) {
                if (i < str1.length()) {
                    strResult += str1.charAt(i);
                    strResult += str2.charAt(i);
                } else {
                    strResult += str2.charAt(i);
                }
            }
        }
        System.out.println(strResult);
    }
}
