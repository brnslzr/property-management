package com.mycompany.property_managemen.interviewQuestions.string;

public class Palindrome {
    public boolean isPalindrome(String word){
        char[] charWord = word.toLowerCase().toCharArray();
        int left = 0;
        int right = word.length() - 1;
        while(left != right){
            if(charWord[left] != charWord[right]){
               return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome checkPalindrome = new Palindrome();
        System.out.println(checkPalindrome.isPalindrome("Civics"));
    }
}
