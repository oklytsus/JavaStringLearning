package org.softserve.academy;

import java.util.Scanner;

/**
 * Substring Between Two Characters:
 * gets a substring of a given string between two specified characters, not positions.
 */
public class Substring {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input your string:");
        String str1 = sc.nextLine();
        System.out.println("Please input first character:");
        char chFrom = sc.next().charAt(0);
        System.out.println("Please input end character:");
        char chEnd = sc.next().charAt(0);;
        String str = "Java2blog(Java blog)";
        String resultString = str1.substring(str1.indexOf(chFrom)+1, str1.indexOf(chEnd));
        System.out.println("Subsstring is: "+resultString);
    }

}


