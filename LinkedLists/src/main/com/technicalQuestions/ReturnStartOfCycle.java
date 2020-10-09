package com.technicalQuestions;

/*
Given a potentially cyclical linked list where each value is unique, return the node at which the cycle starts.
If the list does not contain a cycle, return null.

Ex: Given the following linked lists...

1->2->3, return null
1->2->3->4->5->2 (5 points back to 2), return a reference to the node containing 2
1->9->3->7->7 (7 points to itself), return a reference to the node containing 7

Pseudocode:
    Given Linked List
    Return Node

    2 Pointer Technique
        Create fast and slow pointers to head
    Check if the list is a cycle
        While fast node and fasts next node is not null
            Check to see if slow equals fast
            If slow equals fast
                break out of loop
        End Loop

        If fast or fasts next is null
            Return null

        While slow does not equal fast
            move fast and slow
    Return slow node
 */

public class ReturnStartOfCycle {

    public ReturnStartOfCycle() { }

    public LinkedList.Node getStartOfCycle(LinkedList list){
        LinkedList.Node slow = list.head;
        LinkedList.Node fast = list.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = list.head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

/*
    Big-O Analysis
        Runtime: O(N) where N is the number of nodes in our list.
        Space complexity: O(1) or constant.
*/