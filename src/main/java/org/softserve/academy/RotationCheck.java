package org.softserve.academy;

/**
 * String Rotation Check
 * Write a Java program that checks if one string is a rotation of another, e.g., "abcde" is a rotation of "deabc".
 */
public class RotationCheck {
    static boolean reverseStringsCheck(String str1, String str2) {
        // Check if both strings are of the same length and not empty
        if (str1.length() != str2.length() || str1.length() == 0) {
            return false;
        }

        // Concatenate str1 with itself to check for rotation
        String concatenatedStr = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenatedStr.contains(str2);
    }

    public static void main(String[] args) {
        String str1="abcde";
        String str2="deabc";
        if(reverseStringsCheck(str1,str2)){
            System.out.println(str2 + " is a rotation of " + str1);
        } else{
            System.out.println(str2 + " is not a rotation of " + str1);
        }

    }
}
