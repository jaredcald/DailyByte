package com.technicalQuestions;

/**
Given two strings s and t, which represents a sequence of keystrokes, where # denotes a backspace, return whether
or not the sequences produce the same result.

Ex: Given the following strings...

s = "ABC#", t = "CD##AB", return true
s = "como#pur#ter", t = "computer", return true
s = "cof#dim#ng", t = "code", return false

 Pseudocode
 Given two Strings
 Return Boolean
 Create Stack for each String
 Loop through each string
    If character is not '#'
        Add character to stack
    Else
        remove last element from stack
 End Loops
 Return if strings match

 */

import java.util.Stack;

public class CompareKeystrokes {

    public CompareKeystrokes() {
    }

    //My Solution

    public boolean validate(String s, String t){
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        populateStack(s, s1);
        populateStack(t, s2);

        //compared strings instead of using the stack poping to validate
        return s1.toString().equals(s2.toString());
    }

    private void populateStack(String s, Stack<Character> stack) {
        for(char c : s.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }
            else if(!stack.isEmpty()) stack.pop();
        }
    }


    //Provided Solution


    public boolean validate2(String S, String T) {

        //still created 2 stacks
        Stack<Character> sStack = new Stack<Character>();

        //still looped through each character array
        for(char c: S.toCharArray()) {
            if(c != '#') {
                sStack.push(c);

            // checked to see if stack is empty
            } else if(!sStack.isEmpty()) {
                sStack.pop();
            }
        }

        Stack<Character> tStack = new Stack<Character>();
        for(char c: T.toCharArray()) {
            if(c != '#') {
                tStack.push(c);
            } else if(!tStack.isEmpty()) {
                tStack.pop();
            }
        }

        //used a while loop until either stack is empty
        while(!sStack.isEmpty() && !tStack.isEmpty()) {
            //if one of the characters is different return false
            if(sStack.pop() != tStack.pop()) {
                return false;
            }
        }

        //if both stacks are empty is the goal
        return sStack.isEmpty() && tStack.isEmpty();
    }
}

/*
Big-O Analysis
    Runtime: O(N + M) where N is the number of characters in s and M is the number of characters in t.
    Space complexity: O(N + M) where N is the number of characters in s and M is the number of characters in t.
 */
