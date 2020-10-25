package com.technicalQuestions;

import java.util.LinkedList;

/**
 * Given a binary search tree, rearrange the tree such that it forms a linked list where all its
 * values are in ascending order.
 *
 * Ex: Given the following tree...
 *         5
 *        / \
 *       1   6
 * return...
 *
 * 1
 *  \
 *   5
 *    \
 *     6
 * Ex: Given the following tree...
 *
 *        5
 *       / \
 *     2    9
 *    / \
 *   1   3
 * return...
 *
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       5
 *        \
 *         9
 * Ex: Given the following tree...
 *
 * 5
 *  \
 *   6
 * return...
 *
 * 5
 *  \
 *   6
 *
 *
 *   PseduoCode:
 *   assuming the tree is ordered
 *      if root is null return null
 *      BFS In-Order:
 *          Base Case -
 *          if left node is not null
 *              return traversal of left node
 *          put value into linked list
 *          if right node is not null
 *              return traversal of right node
 *
 *
 *
 *
 */

public class ConvertBSTtoSortedLinkedList {
    public ConvertBSTtoSortedLinkedList() { }

    public LinkedList<Integer> convertBSTtoSLL(TreeNodeExample root){
        if (root == null) return null;
        LinkedList<Integer> list = new LinkedList<>();
        inOrderTraversal(list, root);
        return list;
    }

    public void inOrderTraversal(LinkedList<Integer> list, TreeNodeExample node){
        if(node.left != null)
            inOrderTraversal(list, node.left);
        list.add(node.val);
        if(node.right != null)
            inOrderTraversal(list, node.right);
    }
}

/*
    Big-O Analysis
    Runtime: O(N) where N is the number of nodes in our tree.
    Space complexity: O(N) where N is the number of nodes in our tree.
 */
