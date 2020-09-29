package com.technicalquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {

    ValidAnagram validAnagram = new ValidAnagram();
    String[] testStrings1 = new String[]{"cat", "listen", "program"} ;
    String[] testStrings2 = new String[]{"tac", "silent", "function"};

    @Test
    void ValidAnagramTest1(){
        assertTrue(validAnagram.validAnagram(testStrings1[0],testStrings2[0]));
    }

    @Test
    void ValidAnagramTest2(){
        assertTrue(validAnagram.validAnagram(testStrings1[1],testStrings2[1]));
    }

    @Test
    void ValidAnagramTest3(){
        assertFalse(validAnagram.validAnagram(testStrings1[2],testStrings2[2]));
    }
}
