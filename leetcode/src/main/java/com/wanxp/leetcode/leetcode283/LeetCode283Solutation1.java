package com.wanxp.leetcode.leetcode283;

import java.util.Arrays;

/**
 * 双指针 解法1
 */
public class LeetCode283Solutation1 {
    public void moveZeroes(int[] nums) {
        int leftIndex = 0;
        int rightIndex = 0;
        while(rightIndex < nums.length && leftIndex < nums.length) {
            if (nums[leftIndex] == 0) {
                if(rightIndex == 0) {
                    rightIndex = leftIndex;
                }
                while (rightIndex < nums.length && nums[rightIndex] == 0) {
                    rightIndex++;
                }
                while (rightIndex < nums.length && nums[rightIndex] != 0) {
                    nums[leftIndex] = nums[rightIndex];
                    nums[rightIndex] = 0;
                    leftIndex++;
                    rightIndex++;
                }
            }else {
                leftIndex++;
            }
        }
    }
}
