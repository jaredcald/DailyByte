package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex: Given the tree...
 *
 *         3
 *        / \
 *       1   4
 *  and the search value 1 return a reference to the node containing 1.
 *  Ex: Given the tree
 *
 *         7
 *        / \
 *       5   9
 *          / \
 *         8   10
 * and the search value 9 return a reference to the node containing 9.
 * Ex: Given the tree
 *
 *         8
 *        / \
 *       6   9
 * and the search value 7 return null.
 */

public class FindValueTest {

    public FindValue findValue = new FindValue();

    @Test
    public void FindValueTest1(){
        TreeNodeExample tree = new TreeNodeExample(3);
        tree.left = new TreeNodeExample(1);
        tree.right = new TreeNodeExample(4);
        int search = 1;
        assertEquals(1, findValue.findValue(tree , search).val);
    }

    @Test
    public void FindValueTest2(){
        TreeNodeExample tree = new TreeNodeExample(7);
        tree.left = new TreeNodeExample(5);
        tree.right = new TreeNodeExample(9);
        tree.right.left = new TreeNodeExample(8);
        tree.right.right = new TreeNodeExample(10);
        int search = 9;
        assertEquals(9, findValue.findValue(tree , search).val);
    }

    @Test
    public void FindValueTest3(){
        TreeNodeExample tree = new TreeNodeExample(8);
        tree.left = new TreeNodeExample(6);
        tree.right = new TreeNodeExample(9);
        int search = 7;
        assertEquals(null, findValue.findValue(tree , search));
    }
}
