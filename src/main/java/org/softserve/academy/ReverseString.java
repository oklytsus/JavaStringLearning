package org.softserve.academy;

import java.util.Scanner;

/**
 * Write a program that takes a string from the user and prints it in reverse order.
 * Use a loop to iterate through the string backwards.
 */
public class ReverseString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your string:");
        String string = sc.nextLine();
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        System.out.println("Reversed String is: " + reversedString);
    }
}
