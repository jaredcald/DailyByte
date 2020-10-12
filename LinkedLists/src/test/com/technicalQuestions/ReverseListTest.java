package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
1->2->3->null, return a reference to the node that contains 3 which points to a list that looks like the following: 3->2->1->null
7->15->9->2->null, return a reference to the node that contains 2 which points to a list that looks like the following: 2->9->15->7->null
1->null, return a reference to the node that contains 1 which points to a list that looks like the following: 1->null
 */

public class ReverseListTest {

    ReverseList reverseList = new ReverseList();

    @Test
    public void RemoveValueTest1() {
        String expected = "LinkedList: 3 2 1 ";
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        LinkedList results = new LinkedList(reverseList.reverse(list));

        assertEquals(expected, results.printList());
    }

    @Test
    public void RemoveValueTest2() {
        String expected = "LinkedList: 2 9 15 7 ";
        LinkedList list = new LinkedList(new int[]{7, 15, 9, 2});
        LinkedList results = new LinkedList(reverseList.reverse(list));


        assertEquals(expected, results.printList());
    }

    @Test
    public void RemoveValueTest3() {
        String expected = "LinkedList: 1 ";
        LinkedList list = new LinkedList(new int[]{1});
        LinkedList results = new LinkedList(reverseList.reverse(list));

        assertEquals(expected, results.printList());

    }
}
