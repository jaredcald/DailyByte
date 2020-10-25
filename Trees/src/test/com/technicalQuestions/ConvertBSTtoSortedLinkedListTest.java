package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex: Given the following tree...
 *         5
 *        / \
 *       1   6
 * return...
 * 1
 *  \
 *   5
 *    \
 *     6
 *
 * Ex: Given the following tree...
 *        5
 *       / \
 *     2    9
 *    / \
 *   1   3
 * return...
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       5
 *        \
 *         9
 *
 * Ex: Given the following tree...
 *         5
 *          \
 *           6
 * return...
 * 5
 *  \
 *   6
 */

public class ConvertBSTtoSortedLinkedListTest {

    public ConvertBSTtoSortedLinkedList convertBSTtoSortedLinkedList = new ConvertBSTtoSortedLinkedList();

    @Test
    public void ConvertBSTtoSortedLinkedListTest1(){
        TreeNodeExample tree = new TreeNodeExample(5);
        tree.left = new TreeNodeExample(1);
        tree.right = new TreeNodeExample(6);
        String results = "Returned List:";
        LinkedList<Integer> list = convertBSTtoSortedLinkedList.convertBSTtoSLL(tree);
        for(int val : list){
            results += " " + val;
        }
        assertEquals("Returned List: 1 5 6", results);
    }

    @Test
    public void ConvertBSTtoSortedLinkedListTest2(){
        TreeNodeExample tree = new TreeNodeExample(5);
        tree.left = new TreeNodeExample(2);
        tree.right = new TreeNodeExample(9);
        tree.left.left = new TreeNodeExample(1);
        tree.left.right = new TreeNodeExample(3);
        String results = "Returned List:";
        LinkedList<Integer> list = convertBSTtoSortedLinkedList.convertBSTtoSLL(tree);
        for(int val : list){
            results += " " + val;
        }
        assertEquals("Returned List: 1 2 3 5 9", results);
    }

    @Test
    public void ConvertBSTtoSortedLinkedListTest3(){
        TreeNodeExample tree = new TreeNodeExample(5);
        tree.right = new TreeNodeExample(6);
        String results = "Returned List:";
        LinkedList<Integer> list = convertBSTtoSortedLinkedList.convertBSTtoSLL(tree);
        for(int val : list){
            results += " " + val;
        }
        assertEquals("Returned List: 5 6", results);
    }
}
