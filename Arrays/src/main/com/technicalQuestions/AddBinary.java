package com.technicalQuestions;
/*
    Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
    Note: neither binary string will contain leading 0s unless the string itself is 0

    Ex: Given the following binary strings...

    "100" + "1", return "101"
    "11" + "1", return "100"
    "1" + "0", return  "1"
 */
/*
Pseudocode
    Given two Strings
    Return a String
    Create a carry variable to hold the outcome of adding two binary strings
    Loop through each character in each string and find the sum of both strings if they still exist
        Create a sum variable to hold what will be added to the result string
        Add the value of each character to a sum
        Add the remainder of sum/2 to the result string
        Carry over a 1 if the sum is 2 or more;

    return result string
 */
public class AddBinary {

    public AddBinary() { }

    public String addBinary(String a, String b){
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            //carry over the following number
            int sum = carry;
            if (i >= 0) {
                //character - '0' sets the value of a character to an integer
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            //the sum will either be 0/1/2/3 so
            //insert the remainder to the beginning or the string builder
            result.insert(0, sum % 2);
            //the carry will be either 0 or 1
            carry = sum / 2;
        }

        //if you have reached the end of the strings and there is still a carry you need to insert a 1 at the beginning
        if (carry != 0) {
            result.insert(0, 1);
        }

        return result.toString();
    }
}

/*
Big-O Analysis
    Runtime: O(N + M) where N is the length of one string and M is the length of the other string
    Space complexity: O(max(N, M)) as the longest our resulting string will be is the length of the longer string + 1
 */
