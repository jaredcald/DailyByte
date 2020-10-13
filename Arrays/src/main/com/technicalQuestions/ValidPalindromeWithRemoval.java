package com.technicalQuestions;

/*
Given a string and the ability to delete at most one character, return whether or not it can form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false

Psuedo Code
Given a String
Return a Boolean

2 pointer technique
check each character from beginning and end
if one is not the same as the other
check if the next letter for both pointers can be substituted
if not then return false
 */
public class ValidPalindromeWithRemoval {
    public ValidPalindromeWithRemoval() { }

    public boolean validPalindromeWithRemoval(String s){
        int p1 = 0;
        int p2 = s.length()-1;
        while(p1 < p2){
            if(s.charAt(p1) != s.charAt(p2)){
                //condensed multiple if statements into one external method to just check if either one would produce
                //a valid palindrome
                return (isPalindrome(s, p1 + 1, p2) || isPalindrome(s, p1, 2 - 1));
            }
            p1++;
            p2--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int p1, int p2){
        while(p1 < p2){
            if(s.charAt(p1++) != s.charAt(p2--)){
                return false;
            }
        }
        return true;
    }
}

/*
    Big-O Analysis
        RunTime: O(N) where N is the length of the string
        Space Complexity: O(1)
 */
