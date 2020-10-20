package com.technicalQuestions;

import java.util.HashMap;

/**
Given a string, return the index of its first unique character. If a unique character does not exist, return -1.

Ex: Given the following strings...

"abcabd", return 2
"thedailybyte", return 1
"developer", return 0

PseudoCode
    Given a String
    Return an int
    If String length is 1 return 0
    Create a HashMap
    Create an index
    Loop through each character in the string
        If the character is in the HashMap
            remove it
        Else store character and index found
        Increment index
    Create min value
    Loop through each Key in Hashmap
        Find min index
    Return min
 */
public class FirstUniqueCharacter {
    public FirstUniqueCharacter() { }

    public int firstUniqueCharacter(String s){
        int index = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() == 1) return 0;
        for(char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.remove(c);
            } else map.put(c, index);
            index++;
        }
        //Integer.MAX_VALUE = to set highest value
        int min = Integer.MAX_VALUE;
        //map.keySet() returns a set of keys in Map
        for (char c: map.keySet()) {
            min = Math.min(min, map.get(c));
        }
        return min;
    }
}

/*
    Big-O Analysis
        Runtime: O(N) where N is the number of characters in s.
        Space complexity: O(N) where N is the number of characters in s.
 */
