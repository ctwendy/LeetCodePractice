package com.leetcode.practice.twosum;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void returnIndicesOfTwoPositiveNumber() throws Exception {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] answer = twoSum.twoSum(nums, target);

        List<Integer> answerList = getAnswerList(answer);
        assertThat(answerList, containsInAnyOrder(0, 1));
    }

    @Test
    public void returnIndicesOfTwoDifferentPositionPositiveNumber() throws Exception {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 4;

        int[] answer = twoSum.twoSum(nums, target);

        List<Integer> answerList = getAnswerList(answer);
        assertTrue(answerList.isEmpty());
    }

    @Test
    public void returnIndicesOfSomeNegativeNumber() throws Exception {
        int[] nums = new int[]{2, -7, 11, 15};
        int target = 4;

        int[] answer = twoSum.twoSum(nums, target);

        List<Integer> answerList = getAnswerList(answer);
        assertThat(answerList, containsInAnyOrder(1, 2));
    }

    @Test
    public void returnIndicesOfMoreChoicesOfNumber() throws Exception {
        int[] nums = new int[]{1, 4, 2, 7, 11, 15};
        int target = 9;

        int[] answer = twoSum.twoSum(nums, target);

        List<Integer> answerList = getAnswerList(answer);
        assertThat(answerList, containsInAnyOrder(2, 3));
    }

    @Test
    public void customeTestCase() throws Exception {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        int[] answer = twoSum.twoSum(nums, target);

        List<Integer> answerList = getAnswerList(answer);
        assertThat(answerList, containsInAnyOrder(1, 2));
    }

    private List<Integer> getAnswerList(int[] answer) {
        List<Integer> answerList = Lists.newArrayList();
        for (int index = 0; index < answer.length; index++) {
            answerList.add(answer[index]);
        }
        return answerList;
    }
}