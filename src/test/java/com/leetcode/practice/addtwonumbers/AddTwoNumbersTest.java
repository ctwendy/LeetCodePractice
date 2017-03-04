package com.leetcode.practice.addtwonumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void addTwoNumbersInLinkedList() throws Exception {
        ListNode numOne = createLinkedList(2, 4, 3);
        ListNode numTwo = createLinkedList(5, 6, 4);
        ListNode answer = addTwoNumbers.addTwoNubmers(numOne, numTwo);
        ListNode expected = createLinkedList(7, 0, 8);
        assertTwoListNode(answer, expected);
    }

    private void assertTwoListNode(ListNode answer, ListNode expected) {
        while (answer != null || expected != null) {
            assertNotNull(answer);
            assertNotNull(expected);
            assertEquals(answer.getVal(), expected.getVal());
            answer = answer.getNext();
            expected = expected.getNext();
        }
    }

    private ListNode createLinkedList(int... digits) {
        ListNode start = null;
        ListNode parent = null;
        for (int digit : digits) {
            ListNode listNode = new ListNode(digit);
            if (start == null) {
                start = listNode;
            }

            if (parent != null) {
                parent.setNext(listNode);
            }
            parent = listNode;
        }
        return start;
    }
}