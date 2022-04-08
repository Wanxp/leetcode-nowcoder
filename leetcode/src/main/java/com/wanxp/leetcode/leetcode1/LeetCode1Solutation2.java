package com.wanxp.leetcode.leetcode1;

import java.util.HashMap;
import java.util.Map;

/**
 * Map解法
 */
public class LeetCode1Solutation2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> set = new HashMap<Integer, Integer>(nums.length);
        for(int i = 0;i < nums.length;i++) {
            set.put(nums[i], i);
        }
        for(int i = 0;i < nums.length;i++) {
            if (set.containsKey(i)) {
                return new int[]{set.get(i), i};
            }
        }
        return null;
    }
}
