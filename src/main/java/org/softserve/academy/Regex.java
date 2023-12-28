package org.softserve.academy;

import java.util.Arrays;

public class Regex {
    public static void main(String[] args) {
        String str= "Wellcome elcin toelc!";
        String modStr=str.replace("\\s+", "oq");
        System.out.println(modStr);
        String modStr1=str.replaceAll("\\s+", "-");
        System.out.println(modStr1);
        String s = "Welcome-to*Baeldung";
        String[] result = s.split("\\*");
        String[] expected1 = new String[] { "Welcome", "to", "Baeldung" };
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
        System.out.println("Arrays: " + result.toString());
    }
}
