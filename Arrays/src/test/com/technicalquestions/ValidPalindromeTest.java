package com.technicalquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome = new ValidPalindrome();
    String[] testStrings = new String[]{"level", "algorithm", "A man, a plan, a canal: Panama."};

    @Test
    void ReverseStringTest1(){
        assertTrue(validPalindrome.validPalindrome(testStrings[0]));
    }

    @Test
    void ReverseStringTest2(){
        assertFalse(validPalindrome.validPalindrome(testStrings[1]));
    }

    @Test
    void ReverseStringTest3(){
        assertTrue(validPalindrome.validPalindrome(testStrings[2]));
    }
}
