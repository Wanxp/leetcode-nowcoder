package com.wanxp.leetcode.leetcode448;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 双指针 解法1
 */
public class LeetCode448Solutation2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0;i< nums.length;i++) {
            int index = nums[i];
            if(index < 0) {
                index = -index;
            }
            if(nums[index - 1] > 0) {
                nums[index - 1] = 0 - nums[index - 1];
            }

        }
        for(int i = 0;i< nums.length;i++) {
            if(nums[i] > 0) {
                resultList.add(i + 1);
            }
        }
        return resultList;
    }

}
