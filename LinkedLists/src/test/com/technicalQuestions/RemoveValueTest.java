package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
1->2->3->null, value = 3, return 1->2->null
8->1->1->4->12->null, value = 1, return 8->4->12->null
7->12->2->9->null, value = 7, return 12->2->9->null
 */

public class RemoveValueTest {
    RemoveValue removeValue = new RemoveValue();

    @Test
    public void RemoveValueTest1() {
        String expected = "LinkedList: 1 2 ";
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        int n = 3;
        LinkedList results = removeValue.remove(list, n);

        assertEquals(expected, results.printList());
    }

    @Test
    public void RemoveValueTest2() {
        String expected = "LinkedList: 8 4 12 ";
        LinkedList list = new LinkedList(new int[]{8, 1, 1, 4, 12});
        int n = 2;
        LinkedList results = removeValue.remove(list, 1);


        assertEquals(expected, results.printList());
    }

    @Test
    public void RemoveValueTest3() {
        String expected = "LinkedList: 12 2 9 ";
        LinkedList list = new LinkedList(new int[]{7, 12, 2, 9});
        int n = 7;
        LinkedList results = removeValue.remove(list, n);

        assertEquals(expected, results.printList());

    }
}
