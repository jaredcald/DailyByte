package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String[][] testStringArrays = new String[][]{
            new String[]{"colorado", "color", "cold"},
            new String[]{"a", "b", "c"},
            new String[]{"spot", "spotty", "spotted"}
    };

    @Test
    void LongestCommonPrefixTest1(){
        String actual = longestCommonPrefix.longestCommonPrefix(testStringArrays[0]);
        assertEquals("col", actual);
    }

    @Test
    void LongestCommonPrefixTest2(){
        String actual = longestCommonPrefix.longestCommonPrefix(testStringArrays[1]);
        assertEquals("", actual);
    }

    @Test
    void LongestCommonPrefixTest3(){
        String actual = longestCommonPrefix.longestCommonPrefix(testStringArrays[2]);
        assertEquals("spot", actual);
    }
}
