package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorTest {
    
    public LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
    
    @Test
    public void LowestCommonAncestorTest1(){
        TreeNodeExample tree = new TreeNodeExample(7);
        tree.left = new TreeNodeExample(2);
        tree.right = new TreeNodeExample(9);
        tree.left.left = new TreeNodeExample(1);
        tree.left.right = new TreeNodeExample(5);
        int a = 1, b = 9;
        assertEquals(7, lowestCommonAncestor.findLowestCommonAncestor(tree, a, b).val);
    }

    @Test
    public void LowestCommonAncestorTest2(){
        TreeNodeExample tree = new TreeNodeExample(8);
        tree.left = new TreeNodeExample(3);
        tree.right = new TreeNodeExample(9);
        tree.left.left = new TreeNodeExample(2);
        tree.left.right = new TreeNodeExample(6);
        int a = 1, b = 6;
        assertEquals(3, lowestCommonAncestor.findLowestCommonAncestor(tree, a, b).val);
    }

    @Test
    public void LowestCommonAncestorTest3(){
        TreeNodeExample tree = new TreeNodeExample(8);
        tree.left = new TreeNodeExample(6);
        tree.right = new TreeNodeExample(9);
        int a = 6, b = 8;
        assertEquals(8, lowestCommonAncestor.findLowestCommonAncestor(tree, a, b).val);
    }

    @Test
    public void LowestCommonAncestorTest4(){
        TreeNodeExample tree = new TreeNodeExample(7);
        tree.left = new TreeNodeExample(2);
        tree.right = new TreeNodeExample(9);
        tree.left.left = new TreeNodeExample(1);
        tree.left.right = new TreeNodeExample(5);
        int a = 1, b = 9;
        assertEquals(7, lowestCommonAncestor.findLowestCommonAncestor(tree, a, b).val);
    }

    @Test
    public void LowestCommonAncestorTest5(){
        TreeNodeExample tree = new TreeNodeExample(8);
        tree.left = new TreeNodeExample(3);
        tree.right = new TreeNodeExample(9);
        tree.left.left = new TreeNodeExample(2);
        tree.left.right = new TreeNodeExample(6);
        int a = 1, b = 6;
        assertEquals(3, lowestCommonAncestor.findLowestCommonAncestor(tree, a, b).val);
    }

    @Test
    public void LowestCommonAncestorTest6(){
        TreeNodeExample tree = new TreeNodeExample(8);
        tree.left = new TreeNodeExample(6);
        tree.right = new TreeNodeExample(9);
        int a = 6, b = 8;
        assertEquals(8, lowestCommonAncestor.findLowestCommonAncestor(tree, a, b).val);
    }
}
