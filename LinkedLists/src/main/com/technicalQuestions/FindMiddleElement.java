package com.technicalQuestions;
/*
Given a non-empty linked list, return the middle node of the list. If the linked list contains an even number of
elements, return the node closer to the end.


1->2->3->null, return 2
1->2->3->4->null, return 3
1->null, return 1

Pseduo Code
Given a Linked List
Return Integer

Create pointer to head of linked list
Find Linked List Size
While node is not null
    Increment a size counter
Iterate through Linked List to middle node
For each node while counter is less than length divided by 2
    Set node to the next node
Return Middle Nodes Value
 */

public class FindMiddleElement {
    public FindMiddleElement() { }

    public Integer findMiddle (LinkedList l){
        LinkedList.Node node = l.head;
        int length = 0;

        while(node != null){
            length++;
            node = node.next;
        }

        node = l.head;

        for(int i = 0; i  < length / 2; i++){
            node = node.next;
        }
        return node.val;
    }
}

/*
Big-O Analysis
        Runtime: O(N) where N is the number of nodes in our list
        Space complexity: O(1)
*/