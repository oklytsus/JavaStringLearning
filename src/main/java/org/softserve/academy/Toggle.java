package org.softserve.academy;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your string:");
        String str = sc.nextLine();
        sc.close();
        StringBuilder modifiedString = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)) || Character.isLowerCase(str.charAt(i))) {
                if (Character.isUpperCase(str.charAt(i))) {
                    modifiedString.setCharAt(i, Character.toLowerCase(str.charAt(i)));
                } else {
                    modifiedString.setCharAt(i, Character.toUpperCase(str.charAt(i)));

                }

            }
        }
        System.out.println("Toggled string: " + modifiedString);
    }
}
