package com.technicalQuestions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();
    String[] testStrings = new String[]{"Cats", "The Daily Byte", "civic"};

    @Test
    void ReverseStringTest1(){
        String actual = reverseString.reverseString(testStrings[0]);
        assertEquals("staC", actual);
    }

    @Test
    void ReverseStringTest2(){
        String actual = reverseString.reverseString(testStrings[1]);
        assertEquals("etyB yliaD ehT", actual);
    }

    @Test
    void ReverseStringTest3(){
        String actual = reverseString.reverseString(testStrings[2]);
        assertEquals("civic", actual);
    }
}
