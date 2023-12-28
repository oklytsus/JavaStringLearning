package org.softserve.academy;

import java.util.Scanner;

/**
 * String Concatenation with Separators: concatenates two given strings with a user-defined separator in between.
 */
public class ConcatWithSeparator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input first string:");
        String str1 = sc.nextLine();
        System.out.println("Please input second string:");
        String str2 = sc.nextLine();
        System.out.println("Please input separator:");
        String separator = sc.nextLine();
        String resultString=String.join(separator, str1, str2);
        System.out.println("The result is: " +resultString);

    }
}
