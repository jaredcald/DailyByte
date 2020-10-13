package com.technicalQuestions;

/*
Given two integer arrays, return their intersection.
Note: the intersection is the set of elements that are common to both arrays.

Ex: Given the following arrays...

nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []

PseudoCode
    Given 2 Int Arrays
    Return int Array
    Utilizing a HashSet
    Loop through first array
        Add each item to a set
    Create return int arrayList
    Loop through second array
        If num is in the set
        Add number to return array
        Remove from set;
    return array
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfNumbers {
    public IntersectionOfNumbers() { }

    public List<Integer> intersectionOfNumbers(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) set.add(num);
        List<Integer> results = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)){
                results.add(num);
                set.remove(num);
            }
        }
        return results;
    }
}

/*
Big-O Analysis
    Runtime: O(N) where N is the total number of elements in nums1 and nums2.
    Space complexity: O(M) where M is the total number of elements in nums1.
 */
