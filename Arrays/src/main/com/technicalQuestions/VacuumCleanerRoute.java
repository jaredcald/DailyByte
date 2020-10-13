package com.technicalQuestions;

/*
Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its
original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down
respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return true
 */

/*
    PseudoCode

    vacuumCleanerRoute
    boolean function
    takes in a string L R U D
    Equal L/R and U/D
    Parse String and Keep Count of Each Direction
    Check if L equals R and U equals D
    If they are equal return true
    If not return false
 */

public class VacuumCleanerRoute {
    public VacuumCleanerRoute() { }

    public boolean vacuumCleanerRoute(String s) {
        int LR = 0, UD = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'L') LR++;
            else if(c == 'R') LR--;
            else if(c == 'U') UD++;
            else UD--;
        }
        return (LR == 0 && UD == 0);
    }
}
    /*
     Big-O Analysis
        Runtime: O(N) n being the number of characters in the string
        Space complexity: O(1)
     */
