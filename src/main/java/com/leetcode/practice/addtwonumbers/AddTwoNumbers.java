package com.leetcode.practice.addtwonumbers;

public class AddTwoNumbers {
    public ListNode addTwoNubmers(ListNode l1, ListNode l2) {
        boolean carryOver = false;

        ListNode start = null;
        ListNode parent = null;

        while (l1 != null || l2 != null) {
            int numOneDigit = 0;
            int numTwoDigit = 0;

            if (l1 != null) {
                numOneDigit = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                numTwoDigit = l2.val;
                l2 = l2.next;
            }

            int digitSum = numOneDigit + numTwoDigit;
            digitSum = carryOver ? digitSum + 1 : digitSum;

            if (digitSum / 10 > 0) {
                carryOver = true;
                digitSum = digitSum % 10;
            } else {
                carryOver = false;
            }
//            int digitSum = calculateDigitSum(numOneDigit, numTwoDigit);

            ListNode listNode = new ListNode(digitSum);
            if (start == null) {
                start = listNode;
            }
            if (parent != null) {
                parent.next = listNode;
            }
            parent = listNode;
        }

        // remember to take care of the final carry over
        if (carryOver) {
            parent.next = new ListNode(1);
        }

        return start;
    }

//    private int calculateDigitSum(int numOneDigit, int numTwoDigit) {
//        int digitSum = numOneDigit + numTwoDigit;
//        digitSum = carryOver ? digitSum + 1 : digitSum;
//
//        if (digitSum / 10 > 0) {
//            carryOver = true;
//            digitSum = digitSum % 10;
//        } else {
//            carryOver = false;
//        }
//
//        return digitSum;
//    }

}
