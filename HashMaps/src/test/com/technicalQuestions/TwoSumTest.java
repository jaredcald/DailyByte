package com.technicalQuestions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();
    int[][] testIntArray = new int[][]{
            new int[]{1, 3, 8, 2},
            new int[]{3, 9, 13, 7},
            new int[]{4, 2, 6, 5, 2}};
    int[] testTargetSums = new int[]{10, 8, 4};

    @Test
    void TwoSumTest1(){
        assertTrue(twoSum.twoSum(testIntArray[0],testTargetSums[0]));
    }

    @Test
    void TwoSumTest2(){
        assertFalse(twoSum.twoSum(testIntArray[1],testTargetSums[1]));
    }

    @Test
    void TwoSumTest3(){
        assertTrue(twoSum.twoSum(testIntArray[2],testTargetSums[2]));
    }
}
