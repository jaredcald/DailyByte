package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntersectionOfNumbersTest {
    IntersectionOfNumbers intersectionOfNumbers = new IntersectionOfNumbers();
    int[][] testIntArray1 = new int[][]{
            new int[]{2, 4, 4, 2},
            new int[]{1, 2, 3, 3},
            new int[]{2, 4, 6, 8}
    };
    int[][] testIntArray2 = new int[][]{
            new int[]{2, 4},
            new int[]{3, 3},
            new int[]{1, 3, 5, 7}
    };


    @Test
    void IntersectionOfNumbersTest1(){
        List<Integer> actual = intersectionOfNumbers.intersectionOfNumbers(testIntArray1[0],testIntArray2[0]);
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 4));
        assertEquals(expected, actual);
    }

    @Test
    void IntersectionOfNumbersTest2(){
        List<Integer> actual = intersectionOfNumbers.intersectionOfNumbers(testIntArray1[1],testIntArray2[1]);
        List<Integer> expected = new ArrayList<>(Arrays.asList(3));
        assertEquals(expected, actual);
    }

    @Test
    void IntersectionOfNumbersTest3(){
        List<Integer> actual = intersectionOfNumbers.intersectionOfNumbers(testIntArray1[2],testIntArray2[2]);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }
}
