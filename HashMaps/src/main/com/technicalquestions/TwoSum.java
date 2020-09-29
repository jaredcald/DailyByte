package com.technicalquestions;
/*
    Given an array of integers, return whether or not two numbers sum to a given target, k.
        Note: you may not sum a number with itself.

        Ex: Given the following...

        [1, 3, 8, 2], k = 10, return true (8 + 2)
        [3, 9, 13, 7], k = 8, return false
        [4, 2, 6, 5, 2], k = 4, return true (2 + 2)

    PsuedoCode:
        Array of Integers
        Return Boolean
        Utilizing a HashMap
        for each number in the nums array
           Search HashSet for the difference of the current number and the target sum
           If difference does not exist add the number to hashmap
        if you reach the end return false;

 */

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public TwoSum() { }

    public boolean twoSum(int[] nums, int k){
        Set<Integer> map = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(map.contains(k - nums[i])){
               return true;
            }
            map.add(nums[i]);
        }

        return false;
    }
}

/*
    Big-O Analysis
    Run Time: O(N) where n is the size of the nums[]
    Space Complexity: O(1)
 */
