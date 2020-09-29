package com.technicalquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharacterTest {
    FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
    String[] testStrings = new String[]{"abcabd", "thedailybyte", "developer"} ;


    @Test
    void FirstUniqueCharacterTest1(){
        int actual = firstUniqueCharacter.firstUniqueCharacter(testStrings[0]);
        assertEquals(2, actual);
    }

    @Test
    void FirstUniqueCharacterTest2(){
        int actual = firstUniqueCharacter.firstUniqueCharacter(testStrings[1]);
        assertEquals(1, actual);
    }

    @Test
    void FirstUniqueCharacterTest3(){
        int actual = firstUniqueCharacter.firstUniqueCharacter(testStrings[2]);
        assertEquals(0, actual);
    }
}
