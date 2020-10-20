package com.technicalQuestions;

/**
Given a string s containing only lowercase letters, continuously remove adjacent characters that are the same and return the result.

Ex: Given the following strings...

s = "abccba", return ""
s = "foobar", return "fbar"
s = "abccbefggfe", return "a"

Pseudocode:
    Given String
    Return String
    Create Stack
    Create String Builder
    Loop through each character in String
         If stack is empty
            add character to stack
         else if current character equals the character at the top of the stack
            remove character from the stack
     End Loop
     Loop through stack
        Insert each character to the front of the String Builder
     Return String Builder
 */

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public RemoveAdjacentDuplicates() { }

    public String removeAdjDup(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if(stack.isEmpty()) stack.add(c);
            else if(stack.peek() == c){
                stack.pop();
            }
            else stack.add(c);
        }
        while(!stack.isEmpty()){
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}

/*
Big-O Analysis
    Runtime: O(N) where N is the number of characters in s.
    Space complexity: O(N) where N is the number of characters in s.
 */
