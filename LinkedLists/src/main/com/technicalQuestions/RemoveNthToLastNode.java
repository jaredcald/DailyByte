package com.technicalQuestions;
/**
Given a linked list and a value n, remove the nth to last node and return the resulting list.

Ex: Given the following linked lists...

1->2->3->null, n = 1, return 1->2->null
1->2->3->null, n = 2, return 1->3->null
1->2->3->null, n = 3, return 2->3->null

PseudoCode
    Given a Linked List and a value N
    Return a Linked list

    2 Pointer Method (Fast / Slow)
        Use a Fast pointer to move n steps
        Once fast pointer is ahead
        Move both Fast/Slow until Fast is null


    Create a reference to passed linked list
    Create Node pointers to head of referenced list
    While n does not equal 0
        move fast pointer
        decrement n
    If fast is null
        Set head of results to slow.next
    While fast.next does not equal null
        Move fast/slow pointers
    Remove nth node with slow.next = slow.next.next
    Return Linked List
 */

public class RemoveNthToLastNode {
    public RemoveNthToLastNode() { }

    public LinkedList removeNthToLast(LinkedList list, int n){
        LinkedList results = new LinkedList();
        results.head = list.head;
        LinkedList.Node slow = results.head;
        LinkedList.Node fast = results.head;
        while(n > 0){
            fast = fast.next;
            n--;
        }

        if(fast == null){
            results.head = slow.next;
            return results;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return results;
    }
}

/*
Big-O Analysis
    Runtime: O(N) where N is the number of nodes in our list.
    Space complexity: O(1) or constant.
 */
