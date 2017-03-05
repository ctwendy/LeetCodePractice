package com.leetcode.practice.addtwonumbers;

import com.google.common.collect.Lists;

import java.util.List;

public class AddTwoNumbers {

    private boolean carryOver = false;

    public ListNode addTwoNubmers(ListNode numOne, ListNode numTwo) {
        List<Integer> numOneList = Lists.newArrayList();
        List<Integer> numTwoList = Lists.newArrayList();
        while (numOne != null || numTwo != null) {
            if (numOne != null) {
                numOneList.add(numOne.getVal());
                numOne = numOne.getNext();
            }
            if (numTwo != null) {
                numTwoList.add(numTwo.getVal());
                numTwo = numTwo.getNext();
            }
        }

        ListNode start = null;
        ListNode parent = null;
        for (int index = 0; index < Math.max(numOneList.size(), numTwoList.size()); index++) {
            int digitSum = calculateDigitSum(numOneList, numTwoList, index);

            ListNode listNode = new ListNode(digitSum);
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

    private int calculateDigitSum(List<Integer> numOneList, List<Integer> numTwoList, int index) {

        int numOneDigitValue;
        try {
            numOneDigitValue = numOneList.get(index);
        } catch (IndexOutOfBoundsException e) {
            numOneDigitValue = 0;
        }
        int numTwoDigitValue;
        try {
            numTwoDigitValue = numTwoList.get(index);
        } catch (IndexOutOfBoundsException e) {
            numTwoDigitValue = 0;
        }

        int digitSum = numOneDigitValue + numTwoDigitValue;
        digitSum = carryOver ? digitSum + 1 : digitSum;

        if (digitSum / 10 > 0) {
            carryOver = true;
            digitSum = digitSum % 10;
        } else {
            carryOver = false;
        }

        return digitSum;
    }

}
