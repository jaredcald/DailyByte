package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
1->2->3->1 -> true (3 points back to 1)
1->2->3 -> false
1->1 true (1 points to itself)
 */

public class ContainsCycleTest {

    ContainsCycle containsCycle = new ContainsCycle();

    @Test
    public void ContainsCycleTest1() {
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        //hard coding for testing purposes
        list.head.next.next.next = list.head;
        boolean result = containsCycle.isCycle(list);

        assertTrue(result);
    }

    @Test
    public void ContainsCycleTest2() {
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        boolean result = containsCycle.isCycle(list);

        assertFalse(result);
    }

    @Test
    public void ContainsCycleTest3() {
        LinkedList list = new LinkedList(new int[]{1});
        list.head.next = list.head;
        boolean result = containsCycle.isCycle(list);

        assertTrue(result);
    }

    @Test
    public void ContainsCycleTest4() {
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        //hard coding for testing purposes
        list.head.next.next.next = list.head;
        boolean result = containsCycle.isCycle2(list);

        assertTrue(result);
    }

    @Test
    public void ContainsCycleTest5() {
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        boolean result = containsCycle.isCycle2(list);

        assertFalse(result);
    }

    @Test
    public void ContainsCycleTest6() {
        LinkedList list = new LinkedList(new int[]{1});
        list.head.next = list.head;
        boolean result = containsCycle.isCycle2(list);

        assertTrue(result);

    }
}
