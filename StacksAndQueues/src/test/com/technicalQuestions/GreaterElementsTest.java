package com.technicalQuestions;

/**
nums1 = [4,1,2], nums2 = [1,3,4,2], return [-1, 3, -1] because no element in nums2 is greater than 4, 3 is the first
number in nums2 greater than 1, and no element in nums2 is greater than 2.
nums1 = [2,4], nums2 = [1,2,3,4], return [3, -1] because 3 is the first greater element that occurs in nums2 after 2
and no element is greater than 4.

 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreaterElementsTest {

    public GreaterElements greaterElements = new GreaterElements();

    @Test
    public void ValidateCharactersTest1() {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        int[] expected = new int[]{-1, 3, -1};
        int[] actual = greaterElements.greaterElements(nums1, nums2);

        for(int i = 0; i < actual.length; i++){
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void ValidateCharactersTest2() {
        int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{1,2,3,4};
        int[] expected = new int[]{3, -1};
        int[] actual = greaterElements.greaterElements(nums1, nums2);

        for(int i = 0; i < actual.length; i++){
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void ValidateCharactersTest3() {
        int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{4,3,2,1,5};
        int[] expected = new int[]{5, 5};
        int[] actual = greaterElements.greaterElements(nums1, nums2);

        for(int i = 0; i < actual.length; i++){
            assertEquals(expected[i], actual[i]);
        }
    }
}
