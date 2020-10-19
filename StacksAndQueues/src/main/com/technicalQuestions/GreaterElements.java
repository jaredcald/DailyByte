package com.technicalQuestions;

/*
Given two arrays of numbers, where the first array is a subset of the second array, return an array containing all
the next greater elements for each element in the first array, in the second array. If there is no greater element
for any element, output -1 for that number.

Ex: Given the following arrays…

nums1 = [4,1,2], nums2 = [1,3,4,2], return [-1, 3, -1] because no element in nums2 is greater than 4, 3 is the first
number in nums2 greater than 1, and no element in nums2 is greater than 2.
nums1 = [2,4], nums2 = [1,2,3,4], return [3, -1] because 3 is the first greater element that occurs in nums2 after 2
and no element is greater than 4.

PseudoCode
    Given 2 Number Arrays
    Return Array
    Create Stack
    Create Hashmap
    Create Num Array
    For each number in nums2
        While stack is not empty and current num is greater than the top of the stack
            Put pop the top of the stack and current number in Hashmap
        End Loop
        Push current number into stack
    End Loop
    While Stack isnt empty
        Put the top of the stack with a value of -1
    End Loop
    For each number in nums1
        Add to results from map
    End loop
    Return Num Array
 */


import java.util.HashMap;
import java.util.Stack;

public class GreaterElements {

    public GreaterElements() { }

    public int[] greaterElements(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] results = new int[nums1.length];
        for(int i = 0; i < nums2.length; i++){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        for(int i = 0; i < nums1.length; i++){
            results[i] = map.get(nums1[i]);
        }
        return results;
    }
}

/*
Big-O Analysis
    Runtime: O(N + M) where N is the number of elements in nums1 and M is the number of elements in nums2.
    Space complexity: O(N + M) where N is the size of our return array (which is the size of nums1) and M is the size
    of nums2 (due to using a hash map and stack).
 */
