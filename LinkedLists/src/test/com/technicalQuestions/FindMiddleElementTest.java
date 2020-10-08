package com.technicalQuestions;

import org.junit.jupiter.api.Test;

/*
    1->2->3->null, return 2
    1->2->3->4->null, return 3
    1->null, return 1
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMiddleElementTest {

    FindMiddleElement findMiddleElement = new FindMiddleElement();

    @Test
    public void FindMiddleElement1() {
        int expected = 2;
        LinkedList list = new LinkedList(new int[]{1, 2, 3});
        int result = findMiddleElement.findMiddle(list);

        assertEquals(expected, result);
    }

    @Test
    public void FindMiddleElement2() {
        int expected = 3;
        LinkedList list = new LinkedList(new int[]{1, 2, 3, 4});
        int result = findMiddleElement.findMiddle(list);


        assertEquals(expected, result);
    }

    @Test
    public void FindMiddleElement3() {
        int expected = 1;
        LinkedList list = new LinkedList(new int[]{1});
        int result = findMiddleElement.findMiddle(list);

        assertEquals(expected, result);

    }
}
