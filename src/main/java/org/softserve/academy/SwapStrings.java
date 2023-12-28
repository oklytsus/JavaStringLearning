package org.softserve.academy;

import java.util.Scanner;

/**
 * Swap Two Strings Without Temporary Variables:
 * swap the contents of two strings without using any temporary variables.
 */
public class SwapStrings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input the first string:");
        String str1 = sc.nextLine();
        System.out.println("Please input the second string:");
        String str2 = sc.nextLine();
        int str1Length=str1.length();
        str1=str1+str2;
        str2=str1.substring(0,str1Length);
        str1=str1.substring(str1Length);
        System.out.println("The first string after swapping:" + str1);
        System.out.println("The second string after swapping:" + str2);

    }
}
