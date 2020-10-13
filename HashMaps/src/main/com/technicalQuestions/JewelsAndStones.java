package com.technicalQuestions;

/*
Given a string representing your stones and another string representing a list of jewels, return the number of
stones that you have that are also jewels.

Ex: Given the following jewels and stones...

jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0

Pseudocode
    Given 2 Strings: jewels / stones
    Return num of stones (int)

    Brute Force
        Loop through each Stones and see if any are jewels
        O(n^2) not optimal
    HashSet solution
        Create a count int
        Create Set of Characters
        Loop through Jewels and add them to the Set
        Check if Stones are Jewels
        Loop through each stone
        If stone is a jewel increment count
        Return count

 */

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public JewelsAndStones() { }

    public int jewelsAndStones(String j, String s){
        int count = 0;
        Set<Character> jewels = new HashSet<>();
        //for(int i = 0; i < j.length(); i++){
        for(char c: j.toCharArray()){
            jewels.add(c);
        }
        //for(int i = 0; i < s.length(); i++){
        for(char c : s.toCharArray()){
            if(jewels.contains(c)) count++;
        }
        return count;
    }
}/*
    Big-O Analysis
    Runtime: O(N + M) Loop through each string
    Space complexity: O(N) Create a HashSet size of Jewels
*/
