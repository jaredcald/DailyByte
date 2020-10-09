package com.technicalQuestions;

/*
Given a linked list, containing unique numbers, return whether or not it has a cycle.
Note: a cycle is a circular arrangement (i.e. one node points back to a previous node)

Ex: Given the following linked lists...

1->2->3->1 -> true (3 points back to 1)
1->2->3 -> false
1->1 true (1 points to itself)

PseudoCode:
Given Linked List
Return Boolean

Proposed
Utilize Set to add values (if unique)
Create pointer node to Head of Linked List
Loop through List
While node is not null
    If the value of the node exists in the set
        Return True
    Else
        Add the value to the set
        Set node to next node
End Loop
Return False if the node points to null

Provided Solution
Create a slow and fast pointer to head of list
While fast pointer is not null and fast nodes next is not null
    move fast pointer 2 nodes
    move slow pointer 1 node
    If slows value is equal to fast value
        Return true
End loop
Return false if the node points to null
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsCycle {
    public ContainsCycle() { }

    public Boolean isCycle(LinkedList list){
        Set<Integer> set = new HashSet<>();
        LinkedList.Node node = list.head;
        while(node != null){
            if(!set.add(node.val)){
                return true;
            }
            node = node.next;
        }
        return false;

    }

    /*
    Big-O Analysis
        Runtime: O(N) where N is the number of nodes in our list
        Space complexity: O(N) N is the number of nodes in our list
     */

    //provided solution has better space complexity because we do not have to create and populate a set
    public Boolean isCycle2(LinkedList list){
        LinkedList.Node slow = list.head;
        LinkedList.Node fast = list.head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.val == fast.val){
                return true;
            }
        }
        return false;
    }

    /*
    Big-O Analysis
        Runtime: O(N) where N is the number of nodes in our list
        Space complexity: O(1) or constant
     */
}
