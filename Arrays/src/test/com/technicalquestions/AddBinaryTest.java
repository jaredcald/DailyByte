package com.technicalquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {
    public AddBinary addBinary = new AddBinary();
    public String[] testStrings1 = new String[]{"100", "11", "1", "10010"};
    public String[] testStrings2 = new String[]{"1", "1", "0", "11101"};


    @Test
    void ReverseStringTest1(){
        String actual = addBinary.addBinary(testStrings1[0], testStrings2[0]);
        assertEquals("101", actual);
    }

    @Test
    void ReverseStringTest2(){
        String actual = addBinary.addBinary(testStrings1[1], testStrings2[1]);
        assertEquals("100", actual);
    }

    @Test
    void ReverseStringTest3(){
        String actual = addBinary.addBinary(testStrings1[2], testStrings2[2]);
        assertEquals("1", actual);
    }

    @Test
    void ReverseStringTest4(){
        String actual = addBinary.addBinary(testStrings1[3], testStrings2[3]);
        assertEquals("101111", actual);
    }
}
