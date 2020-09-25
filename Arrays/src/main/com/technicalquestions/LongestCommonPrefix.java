package com.technicalquestions;
/*
    Given an array of strings, return the longest common prefix that is shared amongst all strings.
    Note: you may assume all strings only contain lowercase alphabetical characters.

    Ex: Given the following arrays...

    ["colorado", "color", "cold"], return "col"
    ["a", "b", "c"], return ""
    ["spot", "spotty", "spotted"], return "spot"
 */
/*
PseudoCode
    Given an Array of Strings
    Return longest prefix String
    for each character in strings
    check the other strings at the same character index and make sure they are all the same
    if it is not equal or you have reached the end of one string then return longestCommonPrefix
 */


public class LongestCommonPrefix {
    public LongestCommonPrefix() { }

    public String longestCommonPrefix(String[] strings){
        StringBuilder longestCommonPrefix = new StringBuilder();
        int index = 0;
        for(char c: strings[0].toCharArray()) {
            for(int i = 1; i < strings.length; i++) {
                if(index >= strings[i].length() || c != strings[i].charAt(index)) {
                    return longestCommonPrefix.toString();
                }
            }

            longestCommonPrefix.append(c);
            index++;
        }

        return longestCommonPrefix.toString();
    }
}
/*
Big-O Analysis
    Runtime: O(N*M) where N is the number of words given and M is the max number of characters a single string can contain
    Space complexity: O(M) where M is the max number of characters a string can contain
 */
