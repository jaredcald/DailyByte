package com.technicalquestions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();
    String[] testStrings = new String[]{"Cats", "The Daily Byte", "civic"};

    @Test
    void ReverseStringTest1(){
        String actual = reverseString.ReverseString(testStrings[0]);
        assertEquals("staC", actual);
    }
}
.