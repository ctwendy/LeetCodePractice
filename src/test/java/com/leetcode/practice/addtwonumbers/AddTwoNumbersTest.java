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

    @Test
    public void addTwoNumbersInLinkedListWithDifferentLength() throws Exception {
        ListNode numOne = createLinkedList(0, 2, 4, 3);
        ListNode numTwo = createLinkedList(5, 6, 4);
        ListNode answer = addTwoNumbers.addTwoNubmers(numOne, numTwo);
        ListNode expected = createLinkedList(5, 8, 8, 3);
        assertTwoListNode(answer, expected);
    }

    @Test
    public void addTwoNumbersInLinkedListWithFarMoreDifferentLength() throws Exception {
        ListNode numOne = createLinkedList(0, 2, 4, 3);
        ListNode numTwo = createLinkedList(5, 6);
        ListNode answer = addTwoNumbers.addTwoNubmers(numOne, numTwo);
        ListNode expected = createLinkedList(5, 8, 4, 3);
        assertTwoListNode(answer, expected);
    }

    @Test
    public void addTwoNumbersInLinkedListThatNeedToCarryOver() throws Exception {
        ListNode numOne = createLinkedList(5);
        ListNode numTwo = createLinkedList(5);
        ListNode answer = addTwoNumbers.addTwoNubmers(numOne, numTwo);
        ListNode expected = createLinkedList(0, 1);
        assertTwoListNode(answer, expected);
    }

    private void assertTwoListNode(ListNode answer, ListNode expected) {
        while (answer != null || expected != null) {
            assertNotNull(answer);
            assertNotNull(expected);
            assertEquals(answer.val, expected.val);
            answer = answer.next;
            expected = expected.next;
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
                parent.next = listNode;
            }
            parent = listNode;
        }
        return start;
    }
}