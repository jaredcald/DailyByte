package com.technicalQuestions;

/*
s = "ABC#", t = "CD##AB", return true
s = "como#pur#ter", t = "computer", return true
s = "cof#dim#ng", t = "code", return false
 */


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareKeystrokesTest {

    public CompareKeystrokes compareKeystrokes = new CompareKeystrokes();

    @Test
    public void ValidateCharactersTest1() {
        String s = "ABC#", t = "CD##AB";
        boolean result = compareKeystrokes.validate(s , t);

        assertTrue(result);
    }

    @Test
    public void ValidateCharactersTest2() {
        String s = "como#pur#ter", t = "computer";
        boolean result = compareKeystrokes.validate(s , t);

        assertTrue(result);
    }

    @Test
    public void ValidateCharactersTest3() {
        String s = "cof#dim#ng", t = "code";
        boolean result = compareKeystrokes.validate(s , t);

        assertFalse(result);
    }

    @Test
    public void ValidateCharactersTest4() {
        String s = "ABC#", t = "CD##AB";
        boolean result = compareKeystrokes.validate2(s , t);

        assertTrue(result);
    }

    @Test
    public void ValidateCharactersTest5() {
        String s = "como#pur#ter", t = "computer";
        boolean result = compareKeystrokes.validate2(s , t);

        assertTrue(result);
    }

    @Test
    public void ValidateCharactersTest6() {
        String s = "cof#dim#ng", t = "code";
        boolean result = compareKeystrokes.validate2(s , t);

        assertFalse(result);
    }
}
