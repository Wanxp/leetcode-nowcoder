package com.wanxp.leetcode.leetcode448;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 双指针 解法1
 */
public class LeetCode448Solutation1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> valueSet = new HashSet<Integer>(nums.length);
        for(int i : nums) {
            valueSet.add(i);
        }
        List<Integer> resultList = new ArrayList<>();
        for(int i = 1;i <= nums.length;i++) {
            if(!valueSet.contains(i)) {
                resultList.add(i);
            }
        }
        return resultList;
    }
}
