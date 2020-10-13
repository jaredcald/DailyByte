package com.technicalQuestions;
/*
Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all
letters are capitalized, no letters are capitalized, or only the first letter is capitalized.

Ex: Given the following strings...

"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
 */

/*
Pseudocode
Correct Capitalization
Given a String
Return Boolean
True cases:
    If ALL letters are capitalized
    No Letters are capitalized
    Or Only first letter is capitalized

Basic Code walkthrough:
Loop through each character of the string given
if the first character is capitalized and the second letter is capitalized
    loop through the string and ensure the entire string is capitalized
        If not return false
else
   loop through and ensure there are no capitalized letters
        if not return false
return true

 */

public class CorrectCapitalization {

    public CorrectCapitalization() { }

    public boolean correctCapitalization(String s){
        int l = s.length();
        //if first and second letter are capitalized then check if characters are lowercase
        if(Character.isUpperCase(s.charAt(0)) && Character.isUpperCase(s.charAt(1))){
            for(int i = 2; i < l; i++){
                //if a character is lowercase return false
                if(Character.isLowerCase(s.charAt(i))){
                    return false;
                }
            }
        }
        //if both first characters are not uppercase then we check to see if any after the first character are uppercase
        else{
            for(int i = 1; i < l; i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    //Cleaner version of the same solution
    public boolean correctCapitalization2(String s){
        int l = s.length();
        //keeping track of the count of uppercase letters
        int count = 0;
        for(int i = 0; i < l; i++){
            if(Character.isUpperCase(s.charAt(i))) count++;
        }
        //checks are: no uppercase letters/all uppercase letters/ if 1 is upper case make sure it's the first letter
        return (count == 0 || count == l || (count == 1 && Character.isUpperCase(s.charAt(0))));
    }
}
/*
Big-O Analysis
    Runtime: O(N) where N is the number of characters in our word
    Space complexity: O(1)
 */
