package org.softserve.academy;


public class WeekPassword {
    public static void main(String[] args) {
        String password="ab";
        char randomChar ='b';
        System.out.println(isWeakPattern(password, randomChar));
    }
    static boolean isWeakPattern(String currentPassword, char newChar) {
        int length = currentPassword.length();

        // Check for consecutive characters (e.g., 1234, abcd)
        if (length >= 2 && currentPassword.charAt(length - 1) == currentPassword.charAt(length - 2)+1
                && newChar == currentPassword.charAt(length - 1)+1) {
            //isWeak= true;
            return true;
        }

        // Check for repetitive patterns (e.g., aa11bb22)
        return length >= 2 && currentPassword.charAt(length - 1) == newChar;
    }
}
