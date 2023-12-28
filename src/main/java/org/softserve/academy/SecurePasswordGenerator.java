package org.softserve.academy;

import java.security.SecureRandom;

public class SecurePasswordGenerator {

    public static void main(String[] args) {
        int passwordLength = 12; // Set the desired password length
        String generatedPassword = generateSecurePassword(passwordLength);

        System.out.println("Generated Password: " + generatedPassword);
    }

    static String generateSecurePassword(int length) {
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[{]};:'\",<.>/?";

        String allChars = uppercaseChars + lowercaseChars + digitChars + specialChars;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        while (password.length() < length) {
            // Choose a random character from the combined character set
            char randomChar = allChars.charAt(random.nextInt(allChars.length()));

            // Check for consecutive characters or repetitive patterns
            if (isWeakPattern(password.toString(), randomChar)) {
                continue; // Skip weak patterns
            }

            password.append(randomChar);
        }

        return password.toString();
    }

    static boolean isWeakPattern(String currentPassword, char newChar) {
        int length = currentPassword.length();

        // Check for consecutive characters
        if (length >= 2 && currentPassword.charAt(length - 1) == currentPassword.charAt(length - 2) + 1
                && newChar == currentPassword.charAt(length - 1) + 1) {
            return true;
        }

        // Check for repetitive patterns (e.g., aa11bb22)
        int patternLength = 2;
        if (length >= patternLength && currentPassword.substring(length - patternLength).equals(String.valueOf(newChar).repeat(patternLength))) {
            return true;
        }

        return false;
    }
}
