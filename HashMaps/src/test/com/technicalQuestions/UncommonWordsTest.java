package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UncommonWordsTest {
    UncommonWords uncommonWords = new UncommonWords();
    String[] testStrings1 = new String[]{
            "the quick", "the tortoise beat the haire", "copper coffee pot"
    };
    String[] testStrings2 = new String[]{
            "brown fox", "the tortoise lost to the haire", "hot coffee pot"
    };



    @Test
    void UncommonWordsTest1(){
        List<String> actual = uncommonWords.uncommonWords(testStrings1[0],testStrings2[0]);
        List<String> expected = new ArrayList<>(Arrays.asList("the", "quick", "brown", "fox"));
        assertEquals(expected, actual);
    }

    @Test
    void UncommonWordsTest2(){
        List<String> actual = uncommonWords.uncommonWords(testStrings1[1],testStrings2[1]);
        List<String> expected = new ArrayList<>(Arrays.asList("lost", "beat", "to"));
        assertEquals(expected, actual);
    }

    @Test
    void UncommonWordsTest3(){
        List<String> actual = uncommonWords.uncommonWords(testStrings1[2],testStrings2[2]);
        List<String> expected = new ArrayList<>(Arrays.asList("copper", "hot"));
        assertEquals(expected, actual);
    }
}
