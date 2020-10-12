package com.technicalQuestions;

/*
Given a linked list, containing unique values, reverse it, and return the result.

Ex: Given the following linked lists...

1->2->3->null, return a reference to the node that contains 3 which points to a list that looks like the following: 3->2->1->null
7->15->9->2->null, return a reference to the node that contains 2 which points to a list that looks like the following: 2->9->15->7->null
1->null, return a reference to the node that contains 1 which points to a list that looks like the following: 1->null

Pseudocode

Given Linked List
Return Reversed Linked List

Reverse Linked List Technique
Utilizing 3 pointers (current, previous, and next)
Set current to the head of linked list
Set next and previous pointers to null
Loop through the linked list until current is null
    set next node as currents next
    point current to previous
    set previous to current
    set current to next
End loop
return previous pointer (the new head)

1 -> 2 -> 3 -> x
x(previous) -> 1(current) -> 2(next) -> 3 -> x -- Set Next
x(previous) <- 1(current) -> 2(next) -> 3 -> x -- Reverse Pointer to Previous
x <- 1(current/previous) -> 2(next) -> 3 -> x -- Set Previous to Current
x <- 1(previous) -> 2(current/next) -> 3 -> x -- Set Current to Next
 */

public class ReverseList {
    public ReverseList() { }

    public LinkedList.Node reverse (LinkedList list){
        LinkedList.Node previous = null;
        LinkedList.Node next = null;
        LinkedList.Node current = list.head;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}

/*
Big-O Analysis
    Runtime: O(N) where N is the number of nodes in our list.
    Space complexity: O(1) or constant.
 */
