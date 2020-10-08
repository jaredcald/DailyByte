package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
1->2->3->null, n = 1, return 1->2->null
1->2->3->null, n = 2, return 1->3->null
1->2->3->null, n = 3, return 2->3->null
 */

public class RemoveNthToLastNodeTest {
    RemoveNthToLastNode removeNthToLastNode = new RemoveNthToLastNode();

    @Test
    public void RemoveNthToLastNodeTest1() {
        String expected = "LinkedList: 1 2 ";
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        int n = 1;
        LinkedList results = removeNthToLastNode.removeNthToLast(list, n);

        assertEquals(expected, results.printList());
    }

    @Test
    public void RemoveNthToLastNodeTest2() {
        String expected = "LinkedList: 1 3 ";
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        int n = 2;
        LinkedList results = removeNthToLastNode.removeNthToLast(list, 2);

        assertEquals(expected, results.printList());
    }

    @Test
    public void RemoveNthToLastNodeTest3() {
        String expected = "LinkedList: 2 3 ";
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        int n = 3;
        LinkedList results = removeNthToLastNode.removeNthToLast(list, n);

        assertEquals(expected, results.printList());
    }
}
