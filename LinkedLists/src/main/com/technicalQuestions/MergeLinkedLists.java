package com.technicalQuestions;

/*
Given two sorted linked lists, merge them together in ascending order and return a reference to the merged list

Ex: Given the following lists...

list1 = 1->2->3, list2 = 4->5->6->null, return 1->2->3->4->5->6->null
list1 = 1->3->5, list2 = 2->4->6->null, return 1->2->3->4->5->6->null
list1 = 4->4->7, list2 = 1->5->6->null, return 1->4->4->5->6->7->null

PseudoCode
    Given 2 Linked Lists
    Return a Linked list


    Create a LinkedList
    Set the head to the lowest value
    Create pointers to each Linked List

    Loop through list1 OR list2
        If value of list1.node < value of list2.node
            set return linked list next node to list1 node
            move to next node in list1
        Else
            set return linked list next node to list2 node
            move to next node in list2
        move to next node on return list
    If there are nodes left in list1
        set return lists next node to list1
    else
        set return lists next node to list2
    return linked list results
 */


public class MergeLinkedLists {
    public MergeLinkedLists() { }

    public LinkedList merge(LinkedList list1, LinkedList list2){
        LinkedList results = new LinkedList();
        LinkedList.Node l1 = list1.head;
        LinkedList.Node l2 = list2.head;
        if(l1.val < l2.val){
            results.setHead(l1.val);
            l1 = l1.next;
        }
        else{
            results.setHead(l2.val);
            l2 = l2.next;
        }
        LinkedList.Node r = results.head;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                r.next = l1;
                l1 = l1.next;
            } else {
                r.next = l2;
                l2 = l2.next;
            }
            r = r.next;
        }

        if(l1 != null) {
            r.next = l1;
        } else {
            r.next = l2;
        }
        return results;
    }

    /*
    Big-O Analysis
        Runtime: O(N) where N is the number of nodes in both of our lists
        Space complexity: O(1)
     */


}
