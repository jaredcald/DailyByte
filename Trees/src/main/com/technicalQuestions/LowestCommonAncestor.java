package com.technicalQuestions;

/**
 * Given a binary search tree that contains unique values and two nodes within the tree, a, and b, return their lowest
 * common ancestor. Note: the lowest common ancestor of two nodes is the deepest node within the tree such that both
 * nodes are descendants of it.
 *
 * Ex: Given the following tree...
 *        7
 *       / \
 *     2    9
 *    / \
 *   1   5
 * and a = 1, b = 9, return a reference to the node containing 7.
 * Ex: Given the following tree...
 *
 *         8
 *        / \
 *       3   9
 *      / \
 *     2   6
 * and a = 2, b = 6, return a reference to the node containing 3.
 * Ex: Given the following tree...
 *
 *         8
 *        / \
 *       6   9
 * and a = 6, b = 8, return a reference to the node containing 8.
 *
 * PseudoCode:
 *      FindValue BST type:
 *          If root is null return null
 *          If roots value is less than both a and b search left
 *          If roots value is greater than a and b search right
 *          else the value is on the left and right so just return root
 */

public class LowestCommonAncestor {
    public LowestCommonAncestor() {
    }

        //my solution  fixed after looking at new solution
    public TreeNodeExample findLowestCommonAncestor(TreeNodeExample root, int a, int b){
        if (root == null) return null;
        if(a < root.val && b < root.val) return findLowestCommonAncestor(root.left, a, b);
        else if(a > root.val && b > root.val) return findLowestCommonAncestor(root.right, a, b);
        else return root;
    }

        //given solution
        public TreeNodeExample lowestCommonAncestor(TreeNodeExample root, int p, int q) {
            if(p < root.val && q < root.val) {
                return lowestCommonAncestor(root.left, p, q);
            } else if(p > root.val && q > root.val) {
                return lowestCommonAncestor(root.right, p, q);
            } else {
                return root;
            }
        }
}

/*
Big-O Analysis
    Runtime: O(log(N)) where N is the number of nodes in our tree (assuming our tree is balanced).
    Space complexity: O(log(N)) where N is the number of nodes in our tree (assuming our tree is balanced).
 */
