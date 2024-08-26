package com.mycompany.property_managemen.interviewQuestions.string;

public class MergeStringAlternately {
    public String getAlternateString(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int maxLen = Math.max(len1, len2); // Find the maximum length between the two strings

        // Iterate up to the length of the longer string
        for (int i = 0; i < maxLen; i++) {
            // Append character from word1 if within its length
            if (i < len1) {
                output.append(word1.charAt(i));
            }
            // Append character from word2 if within its length
            if (i < len2) {
                output.append(word2.charAt(i));
            }
        }

        return output.toString(); // Convert StringBuilder to String and return
    }

    public static void main(String[] args) {
        MergeStringAlternately example = new MergeStringAlternately();
        System.out.println(example.getAlternateString("abc", "pqr"));   // Output: apbqcr
        System.out.println(example.getAlternateString("ab", "pqrs"));  // Output: apbqrs
        System.out.println(example.getAlternateString("abcd", "pq"));  // Output: apbqcde
    }
}
