package com.technicalQuestions;

/**
Given a linked list and a value, remove all nodes containing the provided value, and return the resulting list.

Ex: Given the following linked lists and values...

1->2->3->null, value = 3, return 1->2->null
8->1->1->4->12->null, value = 1, return 8->4->12->null
7->12->2->9->null, value = 7, return 12->2->9->null

Psuedocode:
Given LinkedList and integer value
Return LinkedList

Create new linked list referencing original linked list
Set head of new linked list to original head
Create Node to loop through
If the head value is equal to search value
    Set head to next node
    Set node
Loop through linked list
While node is not null AND next node is not null
    If next nodes value is the value
        remove node by setting nodes next to nodes next next
    Else
        Set node to next node
Return list
 */

public class RemoveValue {

    public RemoveValue() { }

    public LinkedList remove(LinkedList l, int v){
        LinkedList results = new LinkedList();
        results.head = l.head;
        LinkedList.Node node = results.head;
        while(results.head.val == v){
            results.head = node.next;
            node = node.next;
        }
        while(node != null){
            if(node.next != null && node.next.val == v){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return results;
    }
}

/*
Big-O Analysis
    Runtime: O(N) where N is the number of nodes in our list.
    Space complexity: O(1)
 */
