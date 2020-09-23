package com.technicalquestions;

    /*
        Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
        Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

        Ex: Given the following strings...

        "level", return true
        "algorithm", return false
        "A man, a plan, a canal: Panama.", return true
     */

public class ValidPalindrome {
    public ValidPalindrome(){}

    public boolean validPalindrome(String s){
        int j = s.length() -1;
        for(int i = 0; i < j; i++ ,j-- ){

            //Character is a good way to check for specific character values
            //Removed if checks for while loops to ensure you're checking letters
            //You have to make sure that i < j for IndexOutOfBounds Exceptions
            while(!Character.isLetter(s.charAt(i)) && i < j) i++;

            while(!Character.isLetter(s.charAt(j)) && i < j) j--;

            //Set characters to lower case for character checks
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt((j)))) return false;
        }
        return true;
    }
}
    /*
    Big-O Analysis
            Runtime: O(N) where N is the number of characters in the given string
            Space complexity: O(1)
    */