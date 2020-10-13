package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStonesTest {
    public JewelsAndStones jewelsAndStones = new JewelsAndStones();
    public String[] testStrings1 = new String[]{"abc", "Af", "AYOPD"};
    public String[] testStrings2 = new String[]{"ac", "AaaddfFf", "ayopd"};


    @Test
    void JewelsAndStonesTest1(){
        int actual = jewelsAndStones.jewelsAndStones(testStrings1[0], testStrings2[0]);
        assertEquals(2, actual);
    }

    @Test
    void JewelsAndStonesTest2(){
        int actual = jewelsAndStones.jewelsAndStones(testStrings1[1], testStrings2[1]);
        assertEquals(3, actual);
    }

    @Test
    void JewelsAndStonesTest3(){
        int actual = jewelsAndStones.jewelsAndStones(testStrings1[2], testStrings2[2]);
        assertEquals(0, actual);
    }
}
