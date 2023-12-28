package org.softserve.academy;

import java.util.Scanner;

/**
 * Reverse Words in a String: reverse the order of words in a string.
 */
public class ReverseWordsOrder {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input your string:");
        String inputStr = sc.nextLine();
        String[] tempStrArray = inputStr.split("\\s");
        String result = "";
        for (int i = tempStrArray.length - 1; i >= 0; i--) {
            result += tempStrArray[i] + " ";
        }
        System.out.println("String with reversed order of words: " + result);
    }
}
