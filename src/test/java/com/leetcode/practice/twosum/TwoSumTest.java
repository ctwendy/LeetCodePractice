package com.leetcode.practice.twosum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void returnIndicesOfTwoPositiveNumber() throws Exception {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] answer = twoSum.twoSum(nums, target);

        int[] expected = new int[]{0, 1};
        assertThat(answer, equalTo(expected));
    }

    @Test
    public void returnIndicesOfTwoDifferentPositionPositiveNumber() throws Exception {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 4;

        int[] answer = twoSum.twoSum(nums, target);

        int[] expected = new int[]{};
        assertThat(answer, equalTo(expected));
    }

    @Test
    public void returnIndicesOfSomeNegativeNumber() throws Exception {
        int[] nums = new int[]{2, -7, 11, 15};
        int target = 4;

        int[] answer = twoSum.twoSum(nums, target);

        int[] expected = new int[]{1, 2};
        assertThat(answer, equalTo(expected));
    }

    @Test
    public void returnIndicesOfMoreChoicesOfNumber() throws Exception {
        int[] nums = new int[]{1, 4, 2, 7, 11, 15};
        int target = 9;

        int[] answer = twoSum.twoSum(nums, target);

        int[] expected = new int[]{2, 3};
        assertThat(answer, equalTo(expected));
    }

    @Test
    public void customeTestCase() throws Exception {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        int[] answer = twoSum.twoSum(nums, target);

        int[] expected = new int[]{1, 2};
        assertThat(answer, equalTo(expected));

    }
}