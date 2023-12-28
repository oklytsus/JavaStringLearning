package org.softserve.academy;

import java.util.HashSet;
import java.util.Set;

/**
 * Count Occurrences of Each Character:
 * counts the number of times each character is repeated in a string.
 */
public class CharacterCountSet {
    public static void main(String[] args) {
        String str = "Wghj tyu 567 asdoiu 456#$%$%^dfgRTY HJKWERIOP";
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }

        for (Character c : characters) {
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                if (c.charValue() == str.charAt(i)) {
                    counter++;
                }
            }
            System.out.println("The number of '" + c.charValue() + "'=" + counter);
        }

    }

}
