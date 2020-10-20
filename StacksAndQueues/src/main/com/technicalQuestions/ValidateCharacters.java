package com.technicalQuestions;

/**
Given a string only containing the following characters (, ), {, }, [, and ] return whether or not the opening
and closing characters are in a valid order.

Ex: Given the following strings...

"(){}[]", return true
"(({[]}))", return true
"{(})", return false

PseudoCode
Given a String
Return a Boolean
Create Stack
For each character in the array
    If the character is right facing
        push it to the stack
    If the character is left facing check to see if the stack is empty or if the character doest match
        return false if the stack is empty or if the character doesnt match
    Else
        pop the last item off the stack
End Loop
return if the stack is empty
 */

import java.util.Stack;

public class ValidateCharacters {
    public ValidateCharacters() { }

    public Boolean validate(String s){

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '[' || c == '(' || c == '{') stack.push(c);
            else if(c == ']' && (stack.isEmpty() || stack.peek() != '[')) return false;
            else if(c == ')' && (stack.isEmpty() || stack.peek() != '(')) return false;
            else if(c == '}' && (stack.isEmpty() || stack.peek() != '{')) return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }
}
/*
Big-O Analysis
    Runtime: O(N) where N is the number of characters in our string.
    Space complexity: O(N) where N is the number of characters in our string.
*/