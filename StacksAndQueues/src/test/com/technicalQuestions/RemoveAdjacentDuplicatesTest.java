package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
s = "abccba", return ""
s = "foobar", return "fbar"
s = "abccbefggfe", return "a"
 */

public class RemoveAdjacentDuplicatesTest {

    public RemoveAdjacentDuplicates removeAdjacentDuplicates = new RemoveAdjacentDuplicates();

    @Test
    public void ValidateCharactersTest1() {
        String s = "abccba", expected = "";
        String actual = removeAdjacentDuplicates.removeAdjDup(s);

        assertEquals(expected, actual);
    }

    @Test
    public void ValidateCharactersTest2() {
        String s = "foobar", expected = "fbar";
        String actual = removeAdjacentDuplicates.removeAdjDup(s);

        assertEquals(expected, actual);
    }

    @Test
    public void ValidateCharactersTest3() {
        String s = "abccbefggfe", expected = "a";
        String actual = removeAdjacentDuplicates.removeAdjDup(s);

        assertEquals(expected, actual);
    }
}
