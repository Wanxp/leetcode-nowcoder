package com.wanxp.leetcode.leetcode1;

/**
 * 暴力解法
 */
public class LeetCode1Solutation1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i < nums.length - 1;i++) {
            int nextTarget = target - nums[i];
            for(int j = i + 1;j < nums.length;j++) {
                if(nextTarget == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
