package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeLinkedListsTest {
    /**
    list1 = 1->2->3, list2 = 4->5->6->null, return 1->2->3->4->5->6->null
    list1 = 1->3->5, list2 = 2->4->6->null, return 1->2->3->4->5->6->null
    list1 = 4->4->7, list2 = 1->5->6->null, return 1->4->4->5->6->7->null
     */

    MergeLinkedLists mergeLinkedLists = new MergeLinkedLists();

    @Test
    public void MergeLinkedListsTest1() {
        String expected = "LinkedList: 1 2 3 4 5 6 ";
        LinkedList list1 = new LinkedList(new int[]{1, 2, 3});
        LinkedList list2 = new LinkedList(new int[]{4, 5, 6});
        LinkedList results = mergeLinkedLists.merge(list1, list2);

        assertEquals(expected, results.printList());
    }

    @Test
    public void MergeLinkedListsTest2() {
        String expected = "LinkedList: 1 2 3 4 5 6 ";
        LinkedList list1 = new LinkedList(new int[]{1, 3, 5});
        LinkedList list2 = new LinkedList(new int[]{2, 4, 6});
        LinkedList results = mergeLinkedLists.merge(list1, list2);

        assertEquals(expected, results.printList());
    }

    @Test
    public void MergeLinkedListsTest3() {
        String expected = "LinkedList: 1 4 4 5 6 7 ";
        LinkedList list1 = new LinkedList(new int[]{4, 4, 7});
        LinkedList list2 = new LinkedList(new int[]{1, 5, 6});
        LinkedList results = mergeLinkedLists.merge(list1, list2);

        assertEquals(expected, results.printList());

    }

}
