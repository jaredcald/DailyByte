package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReturnStartOfCycleTest {

    public ReturnStartOfCycle returnStartOfCycle = new ReturnStartOfCycle();
    /**
        1->2->3, return null
        1->2->3->4->5->2 (5 points back to 2), return a reference to the node containing 2
        1->9->3->7->7 (7 points to itself), return a reference to the node containing 7
    */
    @Test
    public void ReturnStartOfCycleTest1() {
        LinkedList list = new LinkedList(new int[]{1, 2, 3});

        LinkedList.Node result = returnStartOfCycle.getStartOfCycle(list);

        assertEquals(null, result);
    }

    @Test
    public void ReturnStartOfCycleTest2() {
        LinkedList list = new LinkedList(new int[]{1, 2, 3, 4, 5});
        //hard coding for testing purposes
        list.head.next.next.next.next.next = list.head.next;
        LinkedList.Node result = returnStartOfCycle.getStartOfCycle(list);

        assertEquals(2, result.val);
    }

    @Test
    public void ReturnStartOfCycleTest3() {
        LinkedList list = new LinkedList(new int[]{1, 9, 3, 7});
        list.head.next.next.next.next = list.head.next.next.next;
        LinkedList.Node result = returnStartOfCycle.getStartOfCycle(list);

        assertEquals(7, result.val);
    }
}
