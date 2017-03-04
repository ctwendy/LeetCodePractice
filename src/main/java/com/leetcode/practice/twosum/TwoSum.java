package com.leetcode.practice.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numPositionMap = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            numPositionMap.put(nums[index], index);
            int stillNedd = target - nums[index];
            if (numPositionMap.containsKey(stillNedd) && numPositionMap.get(stillNedd) != index) {
                return new int[]{index, numPositionMap.get(stillNedd)};
            }
        }

        return new int[]{};
    }
}
