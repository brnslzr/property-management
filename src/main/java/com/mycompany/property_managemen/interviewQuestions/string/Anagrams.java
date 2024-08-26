package com.mycompany.property_managemen.interviewQuestions.string;

import java.util.Arrays;

public class Anagrams{
    public static boolean isAnagram(String s1, String s2) {
        // If lengths are not equal, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
