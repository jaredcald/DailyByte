package com.technicalQuestions;
/**
Given two strings s and t return whether or not s is an anagram of t.
Note: An anagram is a word formed by reordering the letters of another word.

Ex: Given the following strings...

s = "cat", t = "tac", return true
s = "listen", t = "silent", return true
s = "program", t = "function", return false

PseudoCode
    Given 2 Strings
    Return Boolean
    Check that string lengths are equal
    Create Hashmap
    Loop through each letter in first string
        Keep count of each character
    Loop through second string
        If the letter doesn't exist return false
        Decrement the count of each letter found
        If the decremented count is less than 0
            Return false
    return true
 */

import java.util.HashMap;

public class ValidAnagram {
    public ValidAnagram() { }

    public boolean validAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }
        for(char c: t.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c) -1);
            }
            else return false;
        }
        return true;
    }
}
/*
    Big-O Analysis
        Runtime: O(N) where N is the total number of characters in both s and t
        Space complexity: O(N) because we are creating a hashmap
 */