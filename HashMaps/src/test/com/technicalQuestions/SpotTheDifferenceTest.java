package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpotTheDifferenceTest {

    public SpotTheDifference spotTheDifference = new SpotTheDifference();
    public String[] testStrings1 = new String[]{"foobar", "ide", "coding"};
    public String[] testStrings2 = new String[]{"barfoot", "idea", "ingcod"};


    @Test
    void SpotTheDifferenceTest1(){
        char actual = spotTheDifference.spotTheDifference(testStrings1[0], testStrings2[0]);
        assertEquals('t', actual);
    }

    @Test
    void SpotTheDifferenceTest2(){
        char actual = spotTheDifference.spotTheDifference(testStrings1[1], testStrings2[1]);
        assertEquals('a', actual);
    }

    @Test
    void SpotTheDifferenceTest3(){
        char actual = spotTheDifference.spotTheDifference(testStrings1[2], testStrings2[2]);
        assertEquals(' ', actual);
    }
}
