package com.wanxp.leetcode.leetcode283;

/**
 * 双指针 解法2
 */
public class LeetCode283Solutation2 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++]=nums[i];
            }
        }
        while(j < nums.length) {
            nums[j++]=0;
        }
    }
}
