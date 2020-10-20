package com.technicalQuestions;

    /**
    Given a string, reverse all of its characters and return the resulting string.

        Ex: Given the following strings...

        “Cat”, return “taC”
        “The Daily Byte”, return "etyB yliaD ehT”
        “civic”, return “civic”
     */

public class ReverseString {

    public ReverseString() {}

    public String reverseString(String s){

        //Because strings are immutable, every time a new character is added to the string an entirely new copy of that
        // string is made with the addition of the new character. Realizing this pitfall, we can improve our solution
        // by initializing a buffer to hold our reversed string before returning the result.
        char[] characters = new char[s.length()];
        //We also need to initialize an index to keep track of where we should place the next character
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            characters[j++] = s.charAt(i);
        }

        return new String(characters);
    }
}

    /*
    Big-O Analysis
        Runtime: O(N) n being the number of characters in the string
        Space complexity: O(1)
     */
