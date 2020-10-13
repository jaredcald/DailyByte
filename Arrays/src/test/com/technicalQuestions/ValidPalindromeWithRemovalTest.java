package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeWithRemovalTest {

    ValidPalindromeWithRemoval validPalindromeWithRemoval = new ValidPalindromeWithRemoval();
    String[] testStrings = new String[]{"abcba", "foobof", "abccab"};

    @Test
    void ValidPalindromeWithRemovalTest1(){
        assertTrue(validPalindromeWithRemoval.validPalindromeWithRemoval(testStrings[0]));
    }

    @Test
    void ValidPalindromeWithRemovalTest2(){
        assertTrue(validPalindromeWithRemoval.validPalindromeWithRemoval(testStrings[1]));
    }

    @Test
    void ValidPalindromeWithRemovalTest3(){
        assertFalse(validPalindromeWithRemoval.validPalindromeWithRemoval(testStrings[2]));
    }
}
